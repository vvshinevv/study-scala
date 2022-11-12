package white.ch10

object Chapter10 extends App {

  val element: Element = new ArrayElement(Array("1", "2", "3")).beside(new ArrayElement(Array("a", "b", "c")))

  println(element.contents mkString "\n")
}
