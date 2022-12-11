package white.ch26.sample

sealed abstract class Expression

case class Var(name: String) extends Expression

case class Number(num: Double) extends Expression

case class UnOp(operator: String, arg: Expression) extends Expression

case class BinOp(operator: String, left: Expression, right: Expression) extends Expression

object UnOp {
  def unapply(expression: Expression): Option[(String, Expression)] = {
    Some(("abs", Number(1L)))
  }
}