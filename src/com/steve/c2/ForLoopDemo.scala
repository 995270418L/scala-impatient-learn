package com.steve.c2

import util.control.Breaks._
/**
  * 这里for循环里面的to和until 的区别就是to是对遍历的数的尾部的数闭区间的，而until是开区间的。
  *
  */
object ForLoopDemo {

    //until
//  def main(args: Array[String]): Unit = {
//    val s = "Hello,Scala"
//    var sum = 0
//    for(i <- 0 until s.length){
//      sum += s(i)
//    }
//    println(sum)
//  }

  // to
/*  def main(args: Array[String]) : Unit = {
    val n = "Hello"
    for(i <- 0 to n.length){
      print(n(i))
    }
  }*/

  // break
//  def main(args: Array[String]): Unit = {
//    var tmp = 0;
//    breakable(
//      for(i <- 1 to 10){
//        if(i == 5){
//          tmp = i;
//          break;
//        }
//      }
//    )
//    print(tmp)
//  }

//  def main(args: Array[String]): Unit = {
//    // 相当于双重循环，第一个表达式是外层循环，第二个表达式为内层循环。
//    var a = for( c <- "Hello"; i <- 0 to 1)
//      yield (c+i).toChar
//    println(a)
//  }

  def guard(args: Array[Int]): Unit = {
    // this is a new collection, and the original collection is not affected.
    val result = for(i <- args if i % 2 == 0) yield 2 * i
  }


}
