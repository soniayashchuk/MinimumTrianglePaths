package com.technicaltask.minpath.input

class StdInReader extends InputReader {
  override def read(): List[List[Int]] = {
    io.Source.stdin.getLines
      .takeWhile(_.nonEmpty)
      .map(line => line.split(' ')
        .map(_.toInt).toList)
      .toList
  }
}
