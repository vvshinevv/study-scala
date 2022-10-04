package ch9
import IntUtils._

object Chapter9 {
  def main(args: Array[String]): Unit = {
    //    val triple = Multiplier(3)
    //    val result = triple.product(13)
    //    println(result)
    //
    //    val conn = DBConnection

    val result = new Page("<html><body><h1>Introduce</h1></body></html>").asPlainText
    println(result)

    val t1: (Int, Char) = (1, '2')


    val doubler = (i: Int) => i * 2
    val plus3 = (i: Int) => i + 3
    println((doubler compose plus3 compose doubler)(1))

    println("Fishes :: " + 3.fishes)
  }
}
