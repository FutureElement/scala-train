package com.imooc.demo.c9

import java.sql.{Connection, DriverManager}

object MysqlApp extends App {
  val url = "jdbc:mysql://localhost:3306/corp_scrmdb"
  val username = "root"
  val password = "123456"
  var connection: Connection = _
  try {
    classOf[com.mysql.jdbc.Driver]

    connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT * FROM Campaign")
    while (resultSet.next()){
      val id = resultSet.getString("id")
      val name = resultSet.getString("name")
      val enabled = resultSet.getString("enabled")
      println(s"id: $id, name: $name, enabled: ${enabled == 1}")
    }
  } catch {
    case e: Exception => e.printStackTrace()
  } finally {
    connection.close()
  }


}
