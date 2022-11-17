package white.ch15

object Chapter15 extends App {
  val result = simplifyToTop(UnOp("-", UnOp("+", Var("X"))))
  println("res => " + result)

  def simplifyToTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("+", e: Expr)) => e
    case UnOp("-", UnOp("+", Var("X"))) =>
      println("here?")
      Var("X")
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case UnOp("-", UnOp(x, Var(y))) => UnOp("+++", Var("+++"))
    case e => e
  }

  val pi = math.E
  val matchResult = math.E match {
    case `pi` => "strange math? Pi = " + `pi`
    case _ => "OK"
  }

  println("matchResult => " + matchResult)


  println("Map(1 -> 2) => " + isIntIntMap(Map(1 -> 2)))
  println("Map(\"1\" -> \"2\") => " + isIntIntMap(Map("1" -> "2")))

  def isIntIntMap(x: Any): Boolean = x match {
    case m: Map[Int, Int] => true
    case _ => false
  }

  println("List(1, 2, 3) => " + isStringArray(Array(1, 2, 3)))
  println("List(\"1\", \"2\") => " + isStringArray(Array("1", "2")))

  def isStringArray(x: Any): String = x match {
    case a: Array[String] => "yes"
    case _ => "no"
  }

  println("binding test => " + isBinding(UnOp("abs", UnOp("abs", Var("X")))))

  def isBinding(expr: Expr) = expr match {
    case UnOp("abs", a@UnOp("abs", _)) => println(a); a
    case _ =>
  }

  def simplifyAdd(e: Expr) = e match {
    case BinOp("+", x, y) => BinOp("*", x, Number(2))
  }

  val withDefault: (Int, String) => Int = {
    case (i, s) =>
      println(s"i => $i")
      i
    case (1, "1") =>
      println("literal")
      1
    case (0, s) => 0
  }

  println(withDefault(1, "1"))

  val second: PartialFunction[List[Int], Int] = {
    case x :: y :: _ => y
  }

  println("second.isDefinedAt(List()) => " + second.isDefinedAt(List()))


  val stringSeq = SeqSample.apply(List("a", "b"))
  val intSeq = SeqSample.apply(List(1, 2))
  println("stringSeq => " + stringSeq)
  println("intSeq => " + intSeq)
}

case class SeqSample(seq: Seq[String]) {

}

object SeqSample {
  def apply(seq: Seq[Int]): Seq[Int] = {
    seq
  }
}