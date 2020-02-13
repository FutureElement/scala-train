package com.imooc.demo.c7

object PartialApp extends App {

  def sayChinese: PartialFunction[String, String] = {
    case "eat" => "吃"
    case "run" => "跑"
    case "sleep" => "睡"
    case _ => "不会"
  }

  println(sayChinese("eat"))
  println(sayChinese("run"))
  println(sayChinese("how are you"))

}
