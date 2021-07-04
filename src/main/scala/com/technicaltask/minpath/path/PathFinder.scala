package com.technicaltask.minpath.path

import com.technicaltask.minpath.model.Path

object PathFinder {

  def findMinPath(triangle: List[List[Int]]): Path = {
    calculatePaths(triangle).head
  }

  private def calculatePaths(triangle: List[List[Int]]): List[Path] = {
    triangle match {
      case Nil => List.empty
      case left :: Nil => left.sliding(2).map(edge => edge.min).map(edge => Path(List(edge), edge)).toList
      case left :: right => ((left zip calculatePaths(right)
        map (subPath => Path(subPath._1 :: subPath._2.edges, subPath._1 + subPath._2.weight))).sliding(2)
        map (pair => if (pair.head.weight <= pair.last.weight) pair.head else pair.last)).toList
    }
  }

}