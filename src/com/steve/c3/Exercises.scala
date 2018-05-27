package com.steve.c3

import scala.collection.mutable.ArrayBuffer
import java.util._

object Exercises {

  def main(args: Array[String]): Unit = {
//    four(Array(1,2,-2,-4,3,-7,0,4,5))
//    six(Array(1,2,3,4,5))
      ten().foreach(println)
  }

  // 不生成一个新的数组
  def swapAdjacent(a: Array[Int]): Unit ={
    var tmp :Int = 0
    for(i <- 0 until a.length if(i % 2 != 0)){
        tmp = a(i)
        a(i) = a(i-1)
        a(i-1) = tmp
    }
    a.map(i => println(i))
  }

  // 生成一个新的数组
  def yieldSwapAdjacent(a: Array[Int]): Unit ={
    var tmp = 0
    var result = for(i <- 0 until a.length)
      yield
        if(i%2 != 0)
          a(i-1)
        else if(i%2 == 0 && i == a.length-1)
          a(i)
        else
          a(i+1)
    result.map(i => println(i))
  }

  def four(a: Array[Int]): Unit ={
    var nagLoc,posLoc = new  ArrayBuffer[Int]
    for(i <-0 until a.length){
      if(a(i) >0)
        posLoc += i
      else
        nagLoc += i
    }
    var result = new ArrayBuffer[Int]
    result ++= {for(i <- posLoc) yield a(i)}
    result ++= {for(i <- nagLoc) yield a(i)}
    val rea = result.toArray
    rea.map(i => println(i))
  }

  def five(a: Array[Double]): Double ={
    a.sum / a.length
  }

  def six(a: Array[Int]): Unit ={
    val b = for(i <- a.indices.reverse) yield a(i)
    b.map(i => println(i))

//    val c = a.sortWith( _ > _)
//    c.map(i => println(i))
  }

  def seven(a: Array[Int]): Unit ={
    a.distinct  //去除重复值
  }

  def eight(a: ArrayBuffer[Int]): ArrayBuffer[Int] ={
    var tmp = for(i <- 0 until a.length if(a(i) < 0)) yield i
    tmp = tmp.drop(1)
    for(i <- tmp.reverse) a.remove(i)
    a
  }

  def nine(a: Array[Int]) = {
    for( i <- 0 until a.length if(i <= a.indexWhere(_ < 0) || a(i) > 0)) yield a(i)
  }

  def ten()={
    val id = "America/"
    TimeZone.getAvailableIDs().filter(_.startsWith(id)).map(_.stripPrefix(id)).sorted;
  }

  def eleven(): Unit ={

  }
}
