package white.ch19

class Holder[T](initial: T) {
  def value: T = value

  def value_=(x: T): Unit = {
    value = x
  }
}

object Runner extends App {
  new Holder[String]("a").value_=("10")
}
