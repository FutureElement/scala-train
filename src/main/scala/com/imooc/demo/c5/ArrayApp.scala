package com.imooc.demo.c5

import scala.collection.mutable.ArrayBuffer

object ArrayApp extends App {
  val a = new Array[String](5)
  a(1) = "Hello"

  println(a)
  println(a(1))

  val b = Array("Hadoop", "Spark", "Storm")
  println(b(0))
  b(0) = "flink"
  println(b(0))

  val c = Array(1, 2, 3, 4, 5, 6)

  println(c.max)
  println(c.sum)
  println(c.min)
  println(c.mkString)
  println(c.mkString(","))
  println(c.mkString("<", ",", ">"))

  val d = ArrayBuffer[Int]()

  d += 1
  d += 2
  d += (3, 4, 5)

  d ++= Array(6, 7, 8)
  d.insert(0, 0)
  d.remove(1)
  d.remove(0, 3)

  println(d)

  d.trimEnd(2)

  for (item <- d) {
    println(item)
  }

  for (item <- d.reverse) {
    println(item)
  }
}
