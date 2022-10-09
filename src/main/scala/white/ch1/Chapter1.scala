package white.ch1

object Chapter1 {
  def main(args: Array[String]): Unit = {
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "World"

    greetStrings(0) = "abc"

    for (i <- greetStrings.indices)
      print(greetStrings(i))
  }

  def max(x: Int, y: Int): Int = {
    1
  }
}
