package white.ch26.sample

object SampleApp extends App {

  simplifyTop(new UnOp("abs", Number(2L)))

  def simplifyTop(expr: Expression): Any = expr match {
    case UnOp("abs", Number(1L)) =>
      println("zero")
    case UnOp("abs", e@Number(_)) =>
      println("first :: {}", e)
    case _ =>
      println("second")
  }
}
