package com.imooc.demo.c4

object SimpleObjectApp {
  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    println(person.name + " " + person.age)

    println("invoke method watchFootball: " + person.watchFootball("nah"))

    person.info()
    println(person.email)
  }
}

class People {
  var name: String = _
  val age = 0

  private val gender = "male"
  private[imooc] val weight = 180
  private[c4] val email = "123@email"

  def eat(): String = {
    name + "eat food..."
  }

  def watchFootball(teamName: String): Unit = {
    println(name + " is watching " + teamName + " game")
  }

  def info(): Unit = {
    println(gender + " " + email + " " + weight)
  }

}
