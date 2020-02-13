package com.imooc.demo.c9

import java.io.FileInputStream

import scala.xml.XML

object XmlApp extends Serializable{

//  scala.Serializable
  def readXmlAttributes():Unit = {
    val xml = XML.load(new FileInputStream("/Users/gzhang/workspace/learn/scala-train/src/main/resources/test.xml"))
    val b = xml \ "a" \ "b"
    println(b)
  }
  readXmlAttributes()

  def loadXml(): Unit = {
    val xml = XML.load(new FileInputStream("/Users/gzhang/workspace/learn/scala-train/src/main/resources/test.xml"))
    println(xml)
  }

  def main(args: Array[String]): Unit = {
    loadXml()
  }

}
