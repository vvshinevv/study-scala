package learning.ch9

trait HtmlUtils {
  def removeMarkup(input: String): String = {
    input
      .replaceAll("""</?\w[^>]*>""", "")
      .replaceAll("<.*>", "")
  }
}
