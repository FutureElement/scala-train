package com.imooc.demo.c6

import scala.util.Random

object MatchApp extends App {

  val names = Array("A", "B", "C")
  val name = names(Random.nextInt(names.length))

  name match {
    case "A" => println("You got A.")
    case "B" => println("You got B.")
    case _ => println("You got Nah...")
  }

  def grade(level: String, course: String): Unit = {
    level match {
      case "A" if (course == "A") => println("Excellent")
      case "B" => println("Just so so")
      case "C" => println("You need work hard")
      case _ if (course == "A") => println("You got Nah...")
      case _ => println("You got Nah2...")
    }
  }

  grade("A", "A")
  grade("B", "D")
  grade("D", "A")
  grade("D", "D")

  def greeting(friends: Array[String]): Unit = {
    friends match {
      case Array("Ted") => println("Hi, Ted!")
      case Array(x, y) => println("Hi, " + x + ", " + y + "!")
      case Array("Ted", _*) => println("Hi, Ted and others!")
      case _ => println("Hi, everybody!")
    }
  }

  println()
  println("=========Array=============")
  greeting(Array("Ted"))
  greeting(Array("Lisi"))
  greeting(Array("Lisi", "wangwu"))
  greeting(Array("Ted", "Lisi", "wangwu"))
  greeting(Array("Ted", "Lisi"))

  def greeting(friends: List[String]): Unit = {
    friends match {
      case "Ted" :: Nil => println("Hi, Ted!")
      case x :: y :: Nil => println("Hi, " + x + ", " + y + "!")
      case List("Ted", _*) => println("Hi, Ted and others!")
      case _ => println("Hi, everybody!")
    }
  }

  println()
  println("=========List=============")
  greeting(List("Ted"))
  greeting(List("Lisi"))
  greeting(List("Lisi", "wangwu"))
  greeting(List("Ted", "Lisi", "wangwu"))
  greeting("Ted" :: "Lisi" :: Nil)


  def typing(obj: Any): Unit = {
    obj match {
      case i: Int => println(i + " is a Int")
      case s: String => println(s + " is a String")
      case m: Map[_, _] => println(m + " is a Map")
      case _ => println("Other type!")
    }
  }

  println()
  println("=========Type=============")
  typing("1")
  typing(1)
  typing(true)
  typing(Map("a" -> "A"))
}
