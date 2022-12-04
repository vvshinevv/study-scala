package white.ch21

object JoesPrefs {
  implicit val prompt = new PreferredPrompt("Yes, master > ")
  implicit val drink = new PreferredDrink("tea ")
}
