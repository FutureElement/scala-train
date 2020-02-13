package com.imooc.demo.c7

object StringApp extends App {
  val name = "PK"
  val team = "Lakers"

  println(s"Hello:$name")
  println(s"Hello:$name, Welcome to $team")

  val b =
    s"""
      |this is 多行文本
      |Hello $name
      |LAL $team
      |""".stripMargin
  println("1111")
  println(b)
  println("1111")
}
