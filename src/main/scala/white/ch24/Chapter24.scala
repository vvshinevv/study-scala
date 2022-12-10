package white.ch24

object Chapter24 extends App {
  val xs = List(1, 2, 3, 4, 5)
  val git = xs grouped 3

  println(git)


  val r1 = Seq(1, 2, 3) == List(1, 2, 3)
  println(r1)

  val v1 = Vector(1 to 10)
  val v2 = Vector(1 to 10: _*)
  println(v1)
  println(v2)

  val v2v = v2.view
  println(v2v map (_ + 1))
  println(v2v map (_ + 1) map (_ * 2))
  println(v2v map (_ + 1) map (_ * 2) to (Vector))
}
