package learning.ch3

object Chapter3 {
  def main(args: Array[String]): Unit = {
    println(t(10, "test"))
  }

  def factorOf(x: Int, y: Int) = y % x == 0

  def test(x: Int, y: String): String = x + y;

  val t = test _

  val f = factorOf _


  def tripleOpTp[A, B](a: A, b: A, c: A, f: (A, A, A) => B) = f(a, b, c)

  def tripleOp(a: Int, b: Int, c: Int, f: (Int, Int, Int) => Int) = f(a, b, c)

  val doubler1: Int => Int = _ * 2

  def safeStringOp(s: String, f: String => String): String = {
    if (s != null) f(s) else s
  }

  def combination(x: Int, y: Int, f: (Int, Int) => Int) = f(x, y)

  def formatDollar(amt: Double): String = "$" + f"${amt % .2f}"

  def power(x: Int, n: Int): Long = {
    if (n >= 1) x * power(x, n - 1)
    else 1
  }

  def max(a: Int, b: Int, c: Int): Unit = {
    def max(x: Int, y: Int): Int = if (x > y) x else y

    max(a, max(b, c))
  }

  def greet(prefix: String = "", name: String) = s"${prefix} - ${name}"

  def sum(items: Int*): Int = {
    var total = 0
    for (i <- items) total += i
    total
  }

  def max(x: Int)(y: Int): Int = if (x > y) x else y

  def identity[T](a: T): T = a

  def double(x: Int): Int = x * 2

  def reverser(s: String): String = s.reverse

  val doubler = (x: Int) => x * 2

  val greeter = (name: String) => s"Hello, $name"

  val maximize = (a: Int, b: Int) => if (a > b) a else b
}
