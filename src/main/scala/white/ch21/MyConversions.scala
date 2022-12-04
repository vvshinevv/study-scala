package white.ch21

object MyConversions {

  implicit def intToString(x: Int): String = {
    println("intToString")
    x.toString
  }
}

object MyConversions2 {

}
