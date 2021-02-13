package com.knoldus.validator

import java.util.regex.{Matcher, Pattern}

class EmailValidator {

  def emailIdIsValid(emailId: String): Boolean =
  {
    val emailPattern: String = "^[_A-Za-z0-9]+@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"
    val pattern: Pattern = java.util.regex.Pattern.compile (emailPattern)
    val matcher: Matcher = pattern.matcher (emailId)
    return matcher.matches
  }
}
