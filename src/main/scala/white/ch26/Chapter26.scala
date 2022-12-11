package white.ch26

object Chapter26 extends App {
  val email = Email("hongs.choi", "kakaopaycorp.com")

  email match {
    case Email(user, domain) => println(user + " AT " + domain)
    case _ => println("not email address")
  }

  val a = UpperCase
  val b = UpperCase


  userTwiceUpper("DIDI@hotmail.com")


  def userTwiceUpper(s: String): String = s match {
    case Email(Twice(x@UpperCase()), domain) => "match: " + x + " in domain " + domain
    case _ => "no match"
  }
}

