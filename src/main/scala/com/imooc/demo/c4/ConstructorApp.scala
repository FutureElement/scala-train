package com.imooc.demo.c4

object ConstructorApp {

  def main(args: Array[String]): Unit = {
    val person = new Person("zhangsan", 30)
    println(person.name + " : " + person.age + " : " + person.school)

    val person2 = new Person("zhangsan2", 50, "male")
    println(person2.name + " : " + person2.age + " : " + person2.gender)

    val student = new Student("zhangsan3", 18, "BCA")
    println(student.name + " : " + student.age + " : " + student.school + " : " + student.major)
    println(student)
  }

}

class Person(val name: String, val age: Int) {
  val school: String = "ustc"
  var gender: String = _

  def this(name: String, age: Int, gender: String) {
    this(name, age)
    this.gender = gender
  }
}

class Student(name: String, age: Int, val major: String) extends Person(name, age) {
  override val school: String = "FE"

  override def toString: String = {
    "Student:[" + name + "]"
  }

}

