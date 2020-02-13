package com.imooc.demo.c7

import scala.io.{BufferedSource, Codec, Source}

object FileApp extends App {
  var file: BufferedSource = _
  var netFile: BufferedSource = _
  try {
    file = Source.fromFile("/Users/gzhang/workspace/learn/scala-train/src/main/resources/test.txt")(Codec.UTF8)
    val txt = file.mkString.trim
    println(txt)

    List(txt)
      .flatMap(_.split(","))
      .groupBy(x => x)
      .foreach(x => println(s"${x._1} : ${x._2.length}"))

    def readLine(): Unit = {
      for (line <- file.getLines()) {
        println(line)
      }
    }
    readLine()

    def readChar(): Unit = {
      for (c <- file) {
        println(c)
      }
    }
    readChar()

    netFile = Source.fromURL("https://www.baidu.com")
    def readNet(): Unit = {
      for (line <- netFile.getLines()) {
        println(line)
      }
    }
    readNet()

  } catch {
    case e: Exception => e.printStackTrace()
  } finally {
    file.close()
    netFile.close()
  }
}
