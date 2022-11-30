package white.ch17

case class SeqSample(seq: Seq[String]) {
  def apply(seq: Seq[Int]): Seq[Int] = {
    seq
  }

  def apply(a: String): String = {
    a
  }

  def apply(b: Int): Int = {
    b
  }
}

object SeqSample {
  def apply(a: String, b: Int): (String, Int) = {
    (a, b)
  }
}

class Test extends App {
  val seq = SeqSample(List("a", "b"))
  seq(1)
  seq("a")
  seq(List(1, 2))
  seq.apply(List(1, 2))

  SeqSample("a", 2)
}