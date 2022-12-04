package white.ch19

import white.ch19.HelloWorld.{FunctorType, animalFunc}

class Animal {}
class Bird extends Animal {}
class Chicken extends Bird {}
class Duck extends Bird {}

object HelloWorld {
  type FunctorType[A] = (A => String) //함수타입 한개 선언

  val birdFunc : FunctorType[Bird] = { a => "Bird" }
  val animalFunc : FunctorType[Animal] = { a => "Animal" }
  val chickenFunc : FunctorType[Chicken] = { a => "Chicken"}
  val duckFunc : FunctorType[Duck] = { a => "Duck"}
}

object AnimalRunner extends App {



  def test_contravariant(a: FunctorType[Bird]): Unit = {
    val ret1 = a(new Chicken);
    println(ret1)
  }

  test_contravariant(animalFunc)
}