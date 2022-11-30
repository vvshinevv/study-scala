package white.ch20

object ThisSample extends App {

  val flag: Boolean = false
  val a = new {
    override val nArg: Int = 1
    override val dArg: Int = 2
  } with RationalTrait

  println(a)

}
