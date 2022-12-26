package white.ch30

import scala.concurrent.Future


object Test extends App {
  val map = Map(1 -> "one", 2 -> "two", 3 -> "three")
  println(1 to map.size map map.get)



  Future.successful(User("name")).flatMap()

  case class User(name: String)
}
