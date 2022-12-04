package white.ch23

object Chapter23 extends App {
  val lara = Person("Lara", isMale = false)
  val bob = Person("Bob", isMale = true)
  val julie = Person("Julie", false, lara, bob)
  val persons = List(lara, bob, julie)


  val fir = persons filter (p => !p.isMale) flatMap (p => p.children map (c => (p.name, c.name)))
  val sen = persons withFilter (p => !p.isMale) flatMap (p => p.children map (c => (p.name, c.name)))

}
