package ch6

object Chapter6 {
  def main(args: Array[String]): Unit = {
    reduceOp
  }

  def reduceOp(): Unit = {
    val ans1 = reduceOp(List(11.3, 23.5, 7.2), 0.0)((a, b) => a + b)
    val ans2 = reduceOp(List(11.3, 23.5, 7.2), 0.0)(_ + _)
    val ans3 = reduceOp(List(11.3, 23.5, 7.2), 0.0) {
      _ + _
    }
    val ans4 = reduceOp(List(11.3, 23.5, 7.2), 0.0) { (a, b) =>
      a + b
    }
    println(ans2)
  }

  def reduceOp[A, B](l: List[A], start: B)(f: (B, A) => B): B = {
    var a = start
    for (i <- l) a = f(a, i)
    a
  }
}
