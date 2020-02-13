package com.imooc.demo.c8

import java.io.File

object ImplicitAspect {
  implicit def man2Superman(man: Man): SuperMan = new SuperMan(man.name)

  implicit def file2RichFile(file: File): RichFile = new RichFile(file)
}
