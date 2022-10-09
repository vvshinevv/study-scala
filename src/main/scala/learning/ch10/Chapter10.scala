package learning.ch10

object Chapter10 {
  def main(args: Array[String]): Unit = {
    val c: Item[Car] = new Item[Volvo](new Volvo)
    println((c.isInstanceOf[Item[Volvo]]))

  }
}
