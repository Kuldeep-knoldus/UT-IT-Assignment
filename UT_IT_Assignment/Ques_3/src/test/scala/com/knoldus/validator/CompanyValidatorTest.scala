package com.knoldus.validator

import com.knoldus.models.Company
import org.scalatest.flatspec.AnyFlatSpec

class CompanyValidatorTest extends AnyFlatSpec {
  "A Company " should "not valid this cantains valid company" in {
    val companyValidator = new CompanyValidator()
    val userInputCompany: Company = Company("Company_A","Company_A@comp.com", "USA")
    val result = companyValidator.companyIsValid(userInputCompany)
    assert(!result)
  }

  it should "valid because it is contains valid company" in {
    val companyValidator = new CompanyValidator()
    val userInputCompany: Company = Company("Knoldus", "knoldus@knoldus.com", "Noida")
    val result = companyValidator.companyIsValid(userInputCompany)
    assert(result)
  }

}
