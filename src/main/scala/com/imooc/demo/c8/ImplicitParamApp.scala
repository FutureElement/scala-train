package com.imooc.demo.c8

object ImplicitParamApp extends App {

  def testParam(implicit name: String): Unit = {
    println(s"$name ~~~~~")
  }

//  implicit val name2: String = "Ted2"
  implicit val age: Int = 1
  implicit val name: String = "Ted"
  testParam
  testParam("A")
}
