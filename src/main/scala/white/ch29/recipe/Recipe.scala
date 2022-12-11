package white.ch29.recipe

class Recipe(val name: String, val ingredients: List[Food], val instructions: String) {
  override def toString: String = name
}
