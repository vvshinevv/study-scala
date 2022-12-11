package white.ch26.applying

case class Var() {
  def apply(): Var = {
    Var()
  }
}

object Var {
  def apply(): Var = {
    Var()
  }
}


