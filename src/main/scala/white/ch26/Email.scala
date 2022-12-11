package white.ch26

case class Email(user: String, domain: String)

object Email {
  def apply(user: String, domain: String): String = user + "@" + domain

  def unapply(str: String): Option[(String, String)] = {
    val parts = str split "@"
    if (parts.length == 2) Some(parts(0), parts(1)) else None
  }
}
