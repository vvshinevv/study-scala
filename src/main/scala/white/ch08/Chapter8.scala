package white.ch08

object Chapter8 extends App {
  def g(y: Int): Int = 1 + y

  val h: Int => Int = (y: Int) => 1 + y

  val z: Int => Int = g

  println(z(1))

//  echo(Seq("what", "is", "that?"))
  echo(Seq("what", "is", "that?"): _*)

  def echo(args: String*) = {
    for (arg <- args) println _
  }
}