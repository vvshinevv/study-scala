package white.ch20

import scala.annotation.tailrec

trait RationalTrait {
  val nArg: Int
  val dArg: Int
  require(dArg != 0)
  private val g = gcd(nArg, dArg)
  val n: Int = nArg / g
  val d: Int = dArg / g

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

  override def toString: String = s"$n/$d"
}
