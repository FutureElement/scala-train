package com.imooc.demo.c4

object AbstractApp {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2()
    student2.speak()
  }
}

abstract class Person2 {
  def speak()

  val name: String
  val age: Int
}

class Student2 extends Person2 {
  override def speak(): Unit = {
    println("My name is " + name + ", I'm " + age + " years old.")
  }

  override val name: String = "student"
  override val age: Int = 18
}
