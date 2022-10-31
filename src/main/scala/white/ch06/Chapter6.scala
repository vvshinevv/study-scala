package white.ch06

import scala.language.implicitConversions

object Chapter6 extends App {
  implicit def intToRational(x: Int): Rational = new Rational(x)

  val oneHalf = new Rational(1, 2)
  val twoThirds = new Rational(2, 3)

  println(oneHalf * 2)
  println(2 * oneHalf)

  twoThirds.hashCode()
}

