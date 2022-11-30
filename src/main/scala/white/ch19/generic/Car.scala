package white.ch19.generic

class Car(val name: String) extends Toy {
  override def toString: String = s"Car:$name"
}
