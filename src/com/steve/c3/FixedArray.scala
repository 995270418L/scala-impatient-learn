package com.steve.c3

import java.util._

import scala.collection.mutable.ArrayBuffer

object FixedArray {

  def fixArray(): Unit ={
    val initArray = Array("a","b")
    val nums = new Array[Int](10);
    val a = new Array[String](10);
    initArray(0) = "GoodBye"
  }

  // java 中的list
  def list(): Unit ={
    // ArrayBuffer用来定义变长的array
    val b = ArrayBuffer[Int]()

    b += 1 // ArrayBuffer(1)

    b += (1,2,3,4,5)    // ArrayBuffer(1,1,2,3,4,5)

    b ++=Array(8,13,21) // 添加别的数组 ArrayBuffer(1,1,2,3,4,5,8,13,21)

    b.trimEnd(5)        //移除最后5个元素

    b.insert(2,6)
    b.remove(2) // 移除第二个位置的元素
    b.remove(2,3) // 从第二个元素开始移除3个元素(包括2号元素)

    b.toArray // 会将一个ArrayBuffer转成数组
  }

  def traverse(s: Array[String]): Unit ={
//    for(i <- 0 until s.length){
//      println(s"${i}: ${s(i)}")
//    }

    // 这个没有行号。。。
//    for(i <- s){
//      println(i)
//    }

    // 隔两个元素遍历
//    for(i <- 0 until s.length by 2){
//      println(s"${i}: ${s(i)}")
//    }

    // 反序遍历
    for(i <- s.indices.reverse){
      println(s"${i}: ${s(i)}")
    }

  }

  def traverseWithMethod(s: Array[Int]): Unit ={
    s.filter(_ % 2 == 0).map(2 * _)
  }

  def multidimensionalArray(): Unit ={
    val matrix = Array.ofDim[Int](3,4);  // 3行4列的数组
    matrix(1)(2) = 42
  }

  def main(args: Array[String]): Unit = {
    traverse(Array("a","bc","def","ghij"))
  }

}
