package white.ch15

object Chapter15 extends App {
  val v = Var("x")
  val op = BinOp("+", Number(1), v)

  println("op => " + op)
  val bool = op.right == Var("x")
  println("bool => " + bool)

  val result = simplifyToTop(UnOp("-", UnOp("+", Var("X"))))
  println("res => " + result)

  def simplifyToTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e: Expr)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case e => e
  }

  val pi = math.E
  val matchResult = math.E match {
    case `pi` => "strange math? Pi = " + `pi`
    case _ => "OK"
  }

  println("matchResult => " + matchResult)
}
