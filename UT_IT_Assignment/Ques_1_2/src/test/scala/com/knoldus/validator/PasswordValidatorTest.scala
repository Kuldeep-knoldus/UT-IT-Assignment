
package com.knoldus.validator
import org.scalatest.funsuite.AnyFunSuite

class PasswordValidatorTest extends AnyFunSuite {

  val password = new PasswordValidator()

  test("Password entered is correct, fulfills all requirements") {
    assert(password.isValidPassword("Kuldeep@2021") === true)
  }
  test("Password should not contain any space") {
    assert(!password.isValidPassword("Kuldeep @ ") === true)
  }
  test("Password should contain at least 1 digit") {
    assert(!password.isValidPassword("Kuldeep@Kuldeep") === true)
  }
  test("Password should contain at least 8 characters") {
    assert(!password.isValidPassword("Kuldeep@Kuldeep") === true)
  }
  test("Password should not exceeds 15 characters") {
    assert(!password.isValidPassword("Kuldeep@123456789") === true)
  }
  test("Password should contain at least one lowercase letter") {
    assert(!password.isValidPassword("KULDEEP@2021") === true)
  }
  test("Password should contain at least one Uppercase letter") {
    assert(!password.isValidPassword("kuldeep@2021") === true)
  }
  test("Password should contain at least one special character") {
    assert(!password.isValidPassword("Kuldeep12345") === true)
  }
  test("Password entered is correct, fulfills all requirements") {
    assert(password.isValidPassword("Kuldeep*2021") === true)
  }
}
