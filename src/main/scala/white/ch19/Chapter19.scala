package white.ch19

import white.ch19.generic.{Car, ElectronicCar}

object Chapter19 extends App {
  val list = new MainQueue[Car](List(new Car("sonata")))
  println(list.enqueue(new Car("bmw 320i")))
  println(list.enqueue(new ElectronicCar("e-tron")))

  case class MainQueue[+T](private val list: List[T]) {
    def enqueue[U >: T](x: U) = new MainQueue[U](x :: list)
  }
}


