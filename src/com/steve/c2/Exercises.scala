package com.steve.c2

object Exercises {

  def main(args: Array[String]): Unit = {
    println(seven("Hello"))
  }

  def signum(a: Int): Int = {
    var r = 11111
    if(a > 0)
      r = 1
    else if(a < 0)
      r = -1
    else
      r = 0
    r
  }
  def four(): Unit ={
    for( i <- 0 to 10){
      println(10-i)
    }
  }

  def countdown(n: Int): Unit ={
    for(i <- 0 to n){
      println(n - i)
    }
  }

  def six(str: String): Long={
    var sum :Long = 1
    for(i <- str){
      sum *= i.toInt
    }
    sum
  }

  // 从做到右去求积 foldLeft
  def seven(str: String): Long = {
    val result = str.foldLeft(1L)(_ * _.toLong)
    result
  }

  // 用递归的方式计算unicode 值
  def nine(str: String): Long = {
    if(str.length == 0 ){
      return 0
    }else if(str.length == 1){
      return str(0).toInt
    }else{
      return str(0).toInt * nine(str.drop(1))
    }
  }

  def ten(x: Double, n: Int): Double = {
    if(n == 0){
      1
    }else if (x >0 && x % 2 == 0){
      var tmp = ten(x,n/2)
      tmp * tmp
    }else if(x > 0 && x % 2 != 0){
      x * ten(x, n-1)
    }else{
      1 / ten(x,-n)
    }
  }
}
