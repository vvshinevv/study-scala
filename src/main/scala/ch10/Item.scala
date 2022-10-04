package ch10

case class Item[+A](a: A) {
  def get:A = a

  // def check(a: A) = {}
}
