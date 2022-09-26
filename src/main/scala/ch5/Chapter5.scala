package ch5

import java.util.UUID

object Chapter5 {
  def main(args: Array[String]): Unit = {
    print(doubles(f(8)))
  }

  def double1(x: Int): Int = {
    println("Now doubling " + 8)
    8 * 2
  }

  def doubles(x: => Int): Int = {
    println("Now doubling " + f(8))
    f(8)
  }

  def f(i: Int): Int = {
    println(s"Hello from f(${i})")
    i
  }

  val statusHandler: Int => String = {
    case 200 => "ok"
    case 400 => "your Error"
    case 500 => "our Error"
    case _ => "Nothing"
  }
}
