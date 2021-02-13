package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company

class CompanyValidator {

//checks for the existance of Company in Database
//checks Email is Valid or Not
  def companyIsValid(company: Company): Boolean =
  {
   
    val companyReadDto = new CompanyReadDto()
    val dbResult: Option[Company] = companyReadDto.getCompanyByName(company.name)
   
    val emailValid = new EmailValidator()
    val emailValidResult = emailValid.emailIdIsValid(company.emailId)

    if(emailValidResult && dbResult.isEmpty)
      true
else
    false
  }

}
