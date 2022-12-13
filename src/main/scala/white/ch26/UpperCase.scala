package white.ch26
case class UpperCase(x: String)
object UpperCase {
  def unapply(s: String): Boolean = (s.toUpperCase == s)
}
