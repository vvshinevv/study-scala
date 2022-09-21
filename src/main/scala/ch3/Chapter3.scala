package ch3

object Chapter3 {
  def main(args: Array[String]): Unit = {
    println(greeter("World"));
  }

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

  def safeStringOp(s: String, f: String => String): String = {
    if (s != null) f(s) else s
  }

  def reverser(s: String): String = s.reverse

  val doubler = (x: Int) => x * 2

  val greeter = (name: String) => s"Hello, $name"
}
