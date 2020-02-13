package com.imooc.demo.c4

object CaseClassApp {
  def main(args: Array[String]): Unit = {
    println(Dog("xiaobai").name)
  }
}

case class Dog(name: String)
