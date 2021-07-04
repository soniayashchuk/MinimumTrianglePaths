package com.technicaltask.minpath.input

class StdInReader extends InputReader {
  override def read(): List[List[Int]] = {
    io.Source.stdin.getLines
      .map(line => line.split(' ')
        .map(_.toInt).toList)
      .toList
  }
}
