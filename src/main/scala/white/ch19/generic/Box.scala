package white.ch19.generic

class Box[T](private var data: T) {
  def set(t: T): Unit = {
    data = t
  }

  def get(): T = data
}
