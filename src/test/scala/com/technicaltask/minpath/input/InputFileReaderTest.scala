package com.technicaltask.minpath.input

import org.scalatest.FunSuite

class InputFileReaderTest extends FunSuite {

  test("valid file") {
    val fileReader = new InputFileReader("src/test/resources/input/valid_input")
    val readed = fileReader.read()
    assert(readed === List(List(1), List(2, 3), List(4, 5, 6)))
  }

}
