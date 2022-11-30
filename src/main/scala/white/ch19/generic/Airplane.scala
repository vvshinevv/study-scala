package white.ch19.generic

class Airplane(val name: String) extends Toy {
  override def toString: String = s"Airplane:$name"

  def fly() = s"$name is flying"
}
