package com.technicaltask.input

import scala.io.Source

class InputFileReader(fileName: String) extends InputReader {
  override def read(): List[List[Int]] = {
    val source = Source.fromFile(fileName)
    val triangle = source.getLines().map(line => line.split(' ')
      .map(_.toInt).toList)
      .toList
    source.close()
    triangle
  }
}
