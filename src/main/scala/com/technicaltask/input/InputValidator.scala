package com.technicaltask.input

object InputValidator {

  def validateInput(triangle: List[List[Int]]): Boolean = {
    (1 to triangle.size)
      .foreach(i => if (triangle(i).size - triangle(i - 1).size != 1) false)
    true
  }

}
