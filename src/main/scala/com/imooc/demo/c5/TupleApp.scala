package com.imooc.demo.c5

object TupleApp extends App {

  val a = (1, 2, 3, 4, 5)

  println(a)
  println(a._1)
  println(a._2)

  for(i <- 0 until(a.productArity)){
    println(a.productElement(i))
  }

}
