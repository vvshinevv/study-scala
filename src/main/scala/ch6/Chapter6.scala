package ch6

object Chapter6 {
  def main(args: Array[String]): Unit = {
    val list: List[Int] = List(1,2,4)
    (List(0, 1, 0) collect {
      case 1 => "ok"
      case _ => "false"
    }).foreach(println(_))
    LazyList.cons

  }
}
