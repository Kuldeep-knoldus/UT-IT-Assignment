package com.knoldus.implements
import org.scalatest.funsuite.AnyFunSuite

class FactorialAndPalindromeImplementTest extends AnyFunSuite {

  val FactorialAndPalindrome = new FactorialAndPalindromeImplement()

  //Test Case to validating the Palindrome
  test("Given Input (2002) is a Palindrome") {
    assert(FactorialAndPalindrome.checkPalindrome(2002) === true)
  }

  test("Given Input (1.331) is NOT a Palindrome") {
    assert(!FactorialAndPalindrome.checkPalindrome(1.331) === true)
  }

  test("Given Input (2021) is NOT a Palindrome") {
    assert(!FactorialAndPalindrome.checkPalindrome(2021) === true)
  }

  test("Given Input (20.02) is a Palindrome") {
    assert(FactorialAndPalindrome.checkPalindrome(20.02) === true)
  }

  //TestCase to validating the Factorial
  test("Factorial of 1 = 1") {
    assert(FactorialAndPalindrome.calculateFactorial(1) === 1)
  }

  test("Factorial of 0 = 1") {
    assert(FactorialAndPalindrome.calculateFactorial(1) === 1)
  }

  test("Factorial of 6 = 720") {
    assert(FactorialAndPalindrome.calculateFactorial(6) === 720)
  }
}
