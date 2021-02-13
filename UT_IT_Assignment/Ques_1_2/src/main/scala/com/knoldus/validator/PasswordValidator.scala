package com.knoldus.validator

class PasswordValidator {

  def isValidPassword(password: String): Boolean = {

    if (password.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,15}$"))
    return true
    else
      false
  }
}
