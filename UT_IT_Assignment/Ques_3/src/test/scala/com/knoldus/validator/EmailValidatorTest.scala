package com.knoldus.validator

import org.scalatest.flatspec.AnyFlatSpec

class EmailValidatorTest extends AnyFlatSpec {

  "An email " should "be Valid " in {
    val emailValidator = new EmailValidator()
    val result = emailValidator.emailIdIsValid("iamkd20@gmail.com")
    assert(result)
  }
  it should "be not valid " in {
    val emailValidator = new EmailValidator()

    val result = emailValidator.emailIdIsValid("iamkd20*@gmail.com")

    assert(!result)
  }
}
