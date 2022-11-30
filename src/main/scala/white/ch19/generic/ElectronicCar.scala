package white.ch19.generic

class ElectronicCar(override val name: String) extends Car(name) {
  override def toString: String = s"ElectronicCar:$name"
}
