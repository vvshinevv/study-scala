package white.ch29.recipe

object SimpleDatabase {
  def allFoods = List(Apple, Orange, Cream, Sugar)

  def foodNamed(name: String): Option[Food] = allFoods.find(_.name == name)

  def allRecipes: List[Recipe] = List(FruitSalad)

}
