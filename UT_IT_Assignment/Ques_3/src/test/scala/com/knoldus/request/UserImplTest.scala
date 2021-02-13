package com.knoldus.request

import com.knoldus.models.User
import com.knoldus.validator.UserValidator
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.flatspec.AnyFlatSpec

class UserImplTest extends AnyFlatSpec {

  "A UserImpl" should "create User because it doesn't not exist in db" in {

    val newUser = User("Kuldeep", "Gangwar", "Knoldus", "iamkd20@gmail.com")
    val mockuserValidator = mock[UserValidator]
    when(mockuserValidator.userIsValid((newUser))) thenReturn (true)

    val userImpl = new UserImpl(mockuserValidator)
    var result = userImpl.createUser(newUser)

    assert(result == Option(newUser.emailId))
  }
  it should "not create User because emaild is not valid" in {

    val newUser = User("Kuldeep ", "gangwar", "Company_A","iamk@d@gmil.com")
    val mockuserValidator = mock[UserValidator]
    when(mockuserValidator.userIsValid((newUser))) thenReturn (false)

    val userImpl = new UserImpl(mockuserValidator)
    var result = userImpl.createUser(newUser)

    assert(result == None)
  }
}
