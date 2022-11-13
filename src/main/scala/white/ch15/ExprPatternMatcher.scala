package white.ch15

object ExprPatternMatcher extends App {
  def exprPatternMatch(e: Expr) = e match {
    case Var(name) => ???
    case Number(num) => ???
    case UnOp(operator, arg) => ???
    case BinOp(operator, left, right) => ???
    case Test(s) => ???
  }
}

