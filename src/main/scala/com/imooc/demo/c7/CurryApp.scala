package com.imooc.demo.c7

object CurryApp extends App {

  def sum1(a: Int, b: Int) = a + b

  def sum2(a: Int)(b: Int) = a + b

  println(sum1(1, 2))
  println(sum2(1)(2))
}
