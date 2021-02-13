package com.knoldus.request

import com.knoldus.models.Company
import com.knoldus.validator.CompanyValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class CompanyImplTest extends AnyFlatSpec {

  "A CompanyImpl" should "create company as it doesn't exist in db" in {
    val testCompany: Company = Company("Company_A", "Company_A@gmail.com", "City_X")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn (true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result == Option(testCompany.name))
  }
  "it" should "create company as it doesn't exist in db" in {
    val testCompany: Company = Company("Apple", "apple@apple.com", "USA")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn (true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result == Option(testCompany.name))
  }  
  "it" should "not create company as it exist in db" in {
    val testCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val mockCompanyValidator = mock[CompanyValidator]
    when(mockCompanyValidator.companyIsValid(testCompany)) thenReturn (true)
    val companyImplTest = new CompanyImpl(mockCompanyValidator)
    val result = companyImplTest.createCompany(testCompany)
    assert(result == Option(testCompany.name))
  }

}

