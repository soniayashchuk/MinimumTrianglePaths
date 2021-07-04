package com.technicaltask.minpath

import com.technicaltask.minpath.input.InputFileReader
import com.technicaltask.minpath.path.PathFinder
import org.scalatest.FunSuite

class MinPathTest extends FunSuite {

  test("small input") {
    val reader = new InputFileReader("src/test/resources/data_small.txt")
    val triangle = reader.read()
    assert(PathFinder.findMinPath(triangle).weight === 50)
  }

  test("big input") {
    val reader = new InputFileReader("src/test/resources/data_big.txt")
    val triangle = reader.read()
    assert(PathFinder.findMinPath(triangle).weight === 2000)
  }

}
