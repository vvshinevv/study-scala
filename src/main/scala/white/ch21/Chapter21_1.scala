package white.ch21

import scala.language.implicitConversions

object Chapter21_1 extends App {

  implicit def int2Range(i: Int): Seq[Int] = 1 to i

  implicit def int2Digit(i: Int): Seq[Int] = i.toString.toList.map(_.toInt)

  def printLength(seq: Seq[Int]): Unit = println(seq.length)

  println("abc".reverse.reverse == "abc")


}
