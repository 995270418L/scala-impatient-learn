package com.steve.c2

import scala.io.StdIn
import scala.util.Try

object ExceptionDemo {

  // 成功的话，输出的是一个Success对象，失败(toInt,除0)回返回一个failure对象，而不会终止程序的运行。
  def main(args: Array[String]): Unit = {
    val result = for(a <- Try{StdIn.readLine("a: ").toInt};
                     b <- Try{StdIn.readLine("b: ").toInt}
    ) yield a/b;
    println(result)
  }

}
