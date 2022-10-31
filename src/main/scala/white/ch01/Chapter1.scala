package white.ch01

import scala.collection.mutable

object Chapter1 {
  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World"

    var movieSet1 = Set("a", "b")
    movieSet1 += "c"

    val movieSet2 = mutable.Set("a", "b")
    movieSet2 += "c"


    val ret = Array.apply(1)
    ret.apply(2)
  }

  def max(x: Int, y: Int): Int = {
    1
  }
}
