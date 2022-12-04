package white.ch23

sealed trait Level

object Level {
  case object Junior extends Level

  case object Mid extends Level

  case object Senior extends Level
}
