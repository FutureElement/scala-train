package com.imooc.demo.c8

import java.io.File

import scala.io.Source
import ImplicitAspect._

object ImplicitApp extends App {
  val man = new Man("Ted")
  man.fly()

  val file = new File("/Users/gzhang/workspace/learn/scala-train/src/main/resources/test.txt")
  println(file.read())
}


class Man(val name: String) {
  def eat(): Unit = {
    println(s"$name can eat")
  }
}

class SuperMan(val name: String) {
  def fly(): Unit = {
    println(s"$name can fly")
  }
}

class RichFile(val file: File) {
  def read(): String = {
    var source: Source = null
    try {
      source = Source.fromFile(file)
      source.mkString.trim
    } catch {
      case e: Exception => e.printStackTrace()
        null
    } finally {
      source.close()
    }
  }
}
