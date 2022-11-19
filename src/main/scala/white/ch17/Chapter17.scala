package white.ch17

object Chapter17 extends App {
  val list = List("1ab", "2ab", "3", "4")
  val result1 = list map (i => i)
  println(result1)
  val result2 = list flatMap { i => i }
  println(result2)


  (1 to 5).map(_ * 2)

  def sum(a: Int, b: Int, c: Int): Int = {
    a + b + c
  }

  val part = sum(1, _, 2)
  println(part(5))
  println("-----------")
  val result = List(1, 2, 3, 4, 5).map {
    val x = (_: Int) * 2
    println("what is x => " + x)
    x
  }
  println(result)

  val empty: List[Int] = Nil
}
