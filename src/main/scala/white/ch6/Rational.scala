package white.ch6

import scala.annotation.tailrec

class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val num: Int = n / g
  val den: Int = d / g

  def this(n: Int) = this(n, 1)

  def +(that: Rational): Rational = new Rational(n * that.den + that.num * d, d * that.den)

  def +(i: Int): Rational = new Rational(num + i * den, den)

  def -(that: Rational): Rational = new Rational(n * that.den - that.num * d, d * that.den)

  def -(i: Int): Rational = new Rational(num - i * den, den)

  def *(that: Rational): Rational = new Rational(num * that.num, den * that.den)

  def *(i: Int): Rational = new Rational(num * i, den)

  def /(that: Rational): Rational = new Rational(num * that.den, den * that.num)

  def /(i: Int): Rational = new Rational(num, den * i)

  @tailrec
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  override def toString: String = s"${n}/${d}"
}
