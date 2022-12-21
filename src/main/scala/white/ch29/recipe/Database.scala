package white.ch29.recipe

abstract class Database {
  def allFoods: List[Food]

  def allRecipes: List[Recipe]

  def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)
}
