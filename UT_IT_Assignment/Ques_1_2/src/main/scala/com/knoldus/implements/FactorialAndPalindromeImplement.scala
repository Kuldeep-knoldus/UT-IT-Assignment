package com.knoldus.implements
import com.knoldus.traits.FactorialAndPalindrome

class FactorialAndPalindromeImplement extends FactorialAndPalindrome {

  def checkPalindrome(number: Int): Boolean = {

    val numberToString = number.toString

    if (numberToString.equals(numberToString.reverse))
      return true
    else
      return false
  }
  override def checkPalindrome(number: Double): Boolean = {

    val numberToString = number.toString

    if (numberToString.equals(numberToString.reverse))
      return true
    else
      return false
  }


  override def calculateFactorial(number: Int): Int = {

    if (number == 0)
      return 1
    number * calculateFactorial(number - 1)
  }
}
