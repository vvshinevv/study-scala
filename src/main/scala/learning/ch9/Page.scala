package learning.ch9

class Page(val s: String) extends HtmlUtils with SafeStringUtils {
  def asPlainText = {
    trimToNone(s)
      .map(removeMarkup)
      .getOrElse("n/a")
  }
}
