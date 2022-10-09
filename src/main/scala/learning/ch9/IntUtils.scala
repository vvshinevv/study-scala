package learning.ch9

object IntUtils {
  implicit class Fishes(val x: Int) {
    def fishes = "Fish" * x
  }
}
