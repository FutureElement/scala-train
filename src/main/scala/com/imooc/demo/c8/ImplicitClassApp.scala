package com.imooc.demo.c8

object ImplicitClassApp extends App {

  implicit class Calculator(val x: Int) {
    def add(y: Int): Int = x + y
  }

  println(1.add(2))

}
