package white.ch17

object Chapter17 extends App {
  val list = List("1ab", "2ab", "3", "4")
  val result1 = list map (i => i)
  println(result1)
  val result2 = list flatMap { i => i }
  println(result2)
}
