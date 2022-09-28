package ch8

class Singular[A](element: A) extends Traversable[A] {
  override def foreach[B](f: A => B) = f(element)

  override def iterator: Iterator[A] = {
    new Iterator[A] {
      override def hasNext: Boolean = ???

      override def next(): A = ???
    }
  }
}
