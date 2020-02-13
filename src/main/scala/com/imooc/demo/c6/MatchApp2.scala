package com.imooc.demo.c6

object MatchApp2 extends App {

  def whoAreYou(person: Person): Unit = {
    person match {
      case CEO() => println("This is CEO")
      case EMPLOYEE() => println("This is employee")
      case OTHERS() => println("This is others")
    }
  }

  whoAreYou(CEO())
  whoAreYou(EMPLOYEE())
  whoAreYou(OTHERS())

  val gradeMap = Map("A" -> "1", "B" -> "2")

  def findGradeByName(name: String): Unit = {
    val grade = gradeMap.get(name)
    grade match {
      case Some(x) => println("You grade is " + x)
      case None => println("You grade not found")
    }
  }

  println()
  println("========some none========")
  findGradeByName("A")
  findGradeByName("B")
  findGradeByName("C")

}

class Person

case class CEO() extends Person

case class EMPLOYEE() extends Person

case class OTHERS() extends Person
