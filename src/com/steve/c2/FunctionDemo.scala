package com.steve.c2

import io.Source._

object FunctionDemo {

  def main(args: Array[String]): Unit = {
    // lazy 只会在使用的时候初始化，但它并不是无消耗的，会有一个方法以线程安全的方式去监控和调用
    lazy val words = fromFile("/home/ubuntu/liu.txt").mkString
    print(recursive(5))
  }

  def add (a : Int= 1, b: Int=2): Int = a + b

  def recursive(n :Int):Int = if(n == 1) return 1 else return n * recursive(n-1)

  def recursiveSum(args: Int*): Int = {
    // 这里 _* 是为了将args.tail 转换成 arguement Sequence. 可以使用args.tails代替
    if(args.length  == 0) 0 else args.head + recursiveSum(args.tail :_*)
  }

  // Unit 返回类型可以省略 = 号
  def procedure(s: String){
    print(s)
  }
}
