package com.technicaltask.minpath.input

object InputValidator {

  def validateInput(triangle: List[List[Int]]): Boolean = {
    if ( triangle.isEmpty ) false
    else {
      var isValid = true
      (1 until triangle.size)
        .foreach(i => if ((triangle(i).size - triangle(i - 1).size) != 1) isValid = false)
      isValid
    }
  }

}
