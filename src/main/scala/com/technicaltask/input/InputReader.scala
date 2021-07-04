package com.technicaltask.input

trait InputReader {
  def read(): List[List[Int]]
}

object InputReader {
  def apply(fileName: Option[String] = None): InputReader = {
    fileName match {
      case Some(name) => new InputFileReader(name)
      case None => new StdInReader
    }
  }
}
