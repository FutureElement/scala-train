package com.imooc.demo.c6

object ExceptionApp extends App {
  try {
    100 / 0
  } catch {
    case e: ArithmeticException => println(e.getMessage)
    case e: Exception => e.printStackTrace()
  } finally {
    println("finally")
  }
}
