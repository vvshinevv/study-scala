package white.ch19

case class SlowAppendQueue[T](elems: List[T]) {
  def head: T = elems.head

  def tail = new SlowAppendQueue(elems.tail)

  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}
