package com.imooc.demo.c7

object FunctionApp extends App {

  val l = List(1, 2, 3, 4, 5, 6, 7, 8)

  val l2 = l
    .map(x => x + 1)
    .map(_ * 2)
    .map(x => {
      x + 2
    })

  println(l)
  println(l2)

  l.map(_ * 3).filter(_ > 8).foreach(println)

  println("--------------------")
  val l3 = List(1, 2, 3, 4, 5)
  println(l3.reduce(_ + _))
  println(l3.reduce(_ - _))
  println(l3.reduceLeft(_ - _))
  // 4-5 3--1 2-4 1--2
  println(l3.reduceRight(_ - _))

  println("--------------------")
  println(l3.fold(5)(_ - _))
  println(l3.foldLeft(0)(_ - _))
  println(l3.foldRight(0)(_ - _)) //3
  println(l3.foldRight(5)(_ - _)) //-2

  println("--------------------")

  val f = List(List(1, 2), List(3, 4), List(5, 6))
  println(f)
  println(f.flatten)

  println(f.map(_.map(_ * 2)))
  println(f.flatMap(_.map(_ * 2)))

}
