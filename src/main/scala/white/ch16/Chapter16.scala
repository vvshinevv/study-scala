package white.ch16

object Chapter16 extends App {
  val list: List[String] = List("1ab", "2ab", "3", "4")
  val result1 = list map ((i) => i)
  println(result1)
  val result2: List[Char] = list flatMap { (i: String) => i }
  println(result2)


  def mSort[T](less: (T, T) => Boolean)(xs: List[T]): List[T] = {
    def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
      case (Nil, _) => ys
      case (_, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (less(x, y)) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }

    val n = xs.length / 2
    if (n == 0) xs
    else {
      val (ys, zs) = xs splitAt n
      merge(mSort(less)(ys), mSort(less)(zs))
    }
  }

  val abcde = List('a', 'b', 'c', 'd', 'e')
  mSort((x: Char, y: Char) => x > y)(abcde)

}
