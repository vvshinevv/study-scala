package white.ch26

object UpperCase {
  def unapply(s: String): Boolean = s.toUpperCase == s
}
