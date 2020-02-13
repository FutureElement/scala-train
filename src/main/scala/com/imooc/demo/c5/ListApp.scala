package com.imooc.demo.c5

import scala.collection.mutable.ListBuffer

object ListApp extends App {
  val l = List(1, 2, 3, 4, 5)

  println(l.head)
  println(l.tail)

  val l2 = 1 :: Nil
  println(l2)

  val l3 = 2 :: l2
  println(l3)

  val l4 = 1 :: 2 :: 3 :: Nil
  println(l4)

  val l5 = ListBuffer[Int]()

  l5 += 2
  l5 += (3, 4, 5)

  l5 ++= List(6, 7, 8, 9)

  l5 -= 2
  l5 -= 3
  l5 -= (1, 4)

  l5 --= List(5, 6, 7, 8)
  println(l5)
  println(l5.toList)
  println(l5.toArray)
  println(l5.isEmpty)
  println(l5.head)
  println(l5.tail)

  def sum(nums: Int*): Int = {
    if (nums.isEmpty) {
      0
    } else {
      nums.head + sum(nums.tail: _*)
    }
  }

  def sum2(nums: Int*): Int = {
    nums.sum
  }

  println(sum())
  println(sum2())
  println(sum(1, 2, 3, 4, 5))
  println(sum2(1, 2, 3, 4, 5))

}
