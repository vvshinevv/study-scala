package white.ch19

trait Queue[+T] {
  def head: T

  def tail: Queue[T]

  def enqueue[U >: T](x: U)
}

object Queue {

  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private case class QueueImpl[T](private val leading: List[T], private val trailing: List[T]) extends Queue[T] {

    def mirror: QueueImpl[T] = if (leading.isEmpty) new QueueImpl(trailing.reverse, Nil) else this

    override def head: T = {
      mirror.leading.head
    }

    override def tail: Queue[T] = {
      val q = mirror
      QueueImpl(q.leading.tail, q.trailing)
    }

    override def enqueue[U >: T](x: U) = {
      QueueImpl[U](leading, x :: trailing)
    }
  }
}