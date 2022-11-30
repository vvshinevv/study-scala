package white.ch20

class Concrete extends Abstract {
  override type T = String

  override def transform(x: T): T = "yes"

  override val initial: T = "a"
  override var current: T = initial
}
