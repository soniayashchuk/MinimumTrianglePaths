package com.technicaltask.minpath.input

import org.scalatest.FunSuite

class InputValidatorTest extends FunSuite {

  test("valid input") {
    val input = List(List(1), List(2, 3), List(4, 5, 6))
    assert(InputValidator.validateInput(input) === true)
  }

  test("invalid input, same size rows") {
    val input = List(List(1), List(2), List(3))
    assert(InputValidator.validateInput(input) === false)
  }

  test("invalid input, previous row larger than current") {
    val input = List(List(1), List(2, 3, 4), List(5))
    assert(InputValidator.validateInput(input) === false)
  }

}
