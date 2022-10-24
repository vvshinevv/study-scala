package white.ch8

object Chapter8 extends App {
  val partialTest = new PartialTest
  val add10 = partialTest.f(10)
  println(add10(20))
}


class PartialTest {
  def f(x: Int) = {
    def g(y: Int) = x + y

    g _
  }
}