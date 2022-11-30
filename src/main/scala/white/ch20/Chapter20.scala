package white.ch20

object Chapter20 extends App {

  //  new ConcreteTime().hour_=(2)
  //
  //  class ConcreteTime extends AbstractTime {
  //
  //    def hour: Int = hour
  //
  //    def hour_=(x: Int): Unit = {
  //      require(0 <= x && x < 24)
  //      hour = x
  //    }
  //  }
  val x = 2
  val a = new  {
    val nArg: Int = 1 * x
    val dArg: Int = 2 * x
  } with RationalTrait

  println(a)
}
