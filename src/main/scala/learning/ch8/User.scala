package learning.ch8

class User(_name: String) {
  val name: String = _name
  val greet: String = s"Hello from ${name}"

  override def toString: String = s"User ${name}"
}
