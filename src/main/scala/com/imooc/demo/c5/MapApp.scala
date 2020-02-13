package com.imooc.demo.c5

import scala.collection._

object MapApp extends App {

  val a = immutable.Map("z" -> "Z", "g" -> "G")
  println(a)
  println(a("z"))
  //  println(a("Z"))  NoSuchElementException: key not found: Z

  val b = mutable.Map("z" -> "Z", "g" -> "G")
  b("z") = "z"
  b("c") = "C"
  println(b)
  println(b("z"))
  println(b("c"))

  val c = mutable.HashMap[String, Int]()
  println(c.getOrElse("age", 18))

  c += ("a" -> 1)
  c += ("a" -> 1, "b" -> 2, "c" -> 3)

  c -= "a"
  println(c)

  for ((k, v) <- c) {
    println(k + " : " + v)
  }

  for (k <- c.keySet) {
    println(k + " : " + c(k))
  }

  for (v <- c.values) {
    println("value: " + v)
  }

  for ((k, _) <- c) {
    println(k + " : " + c(k))
  }

  for ((_, v) <- c) {
    println("value: " + v)
  }
}
