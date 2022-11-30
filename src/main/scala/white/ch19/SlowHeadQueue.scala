package white.ch19

case class SlowHeadQueue[T](smele: List[T]) {
  def head = smele.head

  def tail = new SlowHeadQueue(smele.init)

  def enqueue(x: T) = new SlowHeadQueue(x :: smele)

}
