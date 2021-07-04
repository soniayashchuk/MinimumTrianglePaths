package com.technicaltask.minpath

import com.technicaltask.minpath.input.{InputReader, InputValidator}
import com.technicaltask.minpath.model.Path
import com.technicaltask.minpath.path.PathFinder

object MinimumTrianglePath {

  def main(args: Array[String]) {
    println("This program is going to find minimum path of the triangle provided.\n" +
      "You can either provide file to read values\n" +
      "or use stdIn to insert values manually.\n" +
      "Please, print `f` for file or `m` to manual entering values\n" +
      "Note: if you choose manual typing, use empty line to mark completing of input.")
    val triangle = readAnswerAndReadInput
    if ( InputValidator.validateInput(triangle) ) {
      val minPath = PathFinder.findMinPath(triangle)
      printResult(minPath)
    }
    else {
      print("Sorry, but provided input is invalid. Make sure that it is not empty and represent triangle.")
    }
  }

  private def readAnswerAndReadInput: List[List[Int]] = {
    val answer = io.Source.stdin.getLines().next()
    val fileName = answer match {
      case "f" =>
        println("Enter file name:")
        Option(io.Source.stdin.getLines().next())
      case _ => Option.empty[String]
    }
    InputReader(fileName).read()
  }

  private def printResult(path: Path): Unit = {
    println(s"Minimal path is: ${path.edges.map(_.toString).mkString(" + ")} = ${path.weight}" )
  }

}
