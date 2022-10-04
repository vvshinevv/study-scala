package ch9

trait SafeStringUtils {
  def trimToNone(s: String): Option[String] = {
    Option(s)
      .map(_.trim)
      .filterNot(_.isEmpty)
  }
}
