package com.knoldus.validator

import com.knoldus.models.User
import org.scalatest.flatspec.AnyFlatSpec

class UserValidationTest extends AnyFlatSpec {
  val userValidator: UserValidator = new UserValidator()
  behavior of "this user"

  it should "be valid as its company exist in Database and the Email id is also valid" in {
    val newUser: User = User("Kuldeep", "Gangwar", "Knoldus", "iamkd20@gmail.com")
    assert(userValidator.userIsValid(newUser))
  }

  it should "not be valid as its company exist in Database and also the Email id is not valid" in {
    val newUser = User("Varun", "Singh", "Accenture", "varunsinghhgmail.com")
    assert(!userValidator.userIsValid(newUser))
  }

}