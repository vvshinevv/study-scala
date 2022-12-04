package white.ch23

import java.util.concurrent.atomic.AtomicInteger

object Chapter23_1 extends App {
  def isMidOrSenior(implicit counter: AtomicInteger): Programmer => Boolean =
    programmer => {
      counter.incrementAndGet()
      println("verify level " + programmer)
      List(Level.Mid, Level.Senior).contains(programmer.level)
    }

  def knowsMoreThan1Language(implicit counter: AtomicInteger): Programmer => Boolean =
    programmer => {
      counter.incrementAndGet()
      println("verify number of known languages " + programmer)
      programmer.knownLanguages.size > 1
    }

  val getName: Programmer => String =
    programmer => {
      println("get name " + programmer)
      programmer.name
    }


  val programmers: List[Programmer] = List(
    Programmer(name = "Kelly",
      level = Level.Mid,
      knownLanguages = List("JavaScript")),
    Programmer(name = "John",
      level = Level.Senior,
      knownLanguages = List("Java", "Scala", "Kotlin")),
    Programmer(name = "Dave",
      level = Level.Junior,
      knownLanguages = List("C", "C++"))
  )

  implicit val counter: AtomicInteger = new AtomicInteger(0)

  val desiredProgrammers: List[Programmer] = programmers
    .filter(isMidOrSenior)
    .filter(knowsMoreThan1Language)

  println(counter.get() == 5)
  println(desiredProgrammers.map(getName) == List("John"))
  println(counter.get() == 5)
}
