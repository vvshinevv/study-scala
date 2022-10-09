package learning.ch10

sealed trait Animal
object Animal {
  case class Dog(data1: Any) extends Animal
  case class Cat(data2: Int) extends Animal
  case object AA extends Animal
}

object App extends App {

  def test(a: Animal): Unit = {
    a match {
      case Animal.Dog(aa: String) =>  aa
      case Animal.Dog(aa: Int) =>  aa
      case Animal.Dog("dog2") =>
      case Animal.Cat(data2) => data2
      case Animal.AA =>
    }
  }
}
