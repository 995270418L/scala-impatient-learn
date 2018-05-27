package com.steve.c1

import math.BigInt.probablePrime
import util.Random
/**
  * One way to create random file or directory names is to produce a random
  * BigInt and convert it to base 36, yielding a string such as "qsnvbevtomcj38o06kul".
  * Poke around Scaladoc to find a way of doing this in Scala
  */
object Base36 {

  def main(args: Array[String]): Unit = {
      val randomResult: BigInt = probablePrime(100,Random);
      var output = randomResult.toString(36);
      println(output);
  }
}
