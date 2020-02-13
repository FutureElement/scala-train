package com.imooc.demo.c4

object ApplyApp {
  def main(args: Array[String]): Unit = {
    for (_ <- 1 to 10) {
      ApplyTest.incr()
    }

    println(ApplyTest.count)

    val a = ApplyTest()
    println("~~~~~~1~~~~~~~")
    a()
    println("~~~~~~2~~~~~~~")
    val c = new ApplyTest()
    println("~~~~~~~3~~~~~~")
    c()
  }
}

class ApplyTest {
  def apply(): ApplyTest = {
    println("class ApplyTest")
    new ApplyTest()
  }
}

object ApplyTest {
  var count = 0

  def incr(): Unit = synchronized {
    count = count + 1
  }

  def apply(): ApplyTest = {
    println("object ApplyTest")
    new ApplyTest()
  }
}
