package white.ch29.recipe

object SimpleDatabase extends Database {
  override def allFoods: List[Food] = List(Apple, Orange, Cream, Sugar)

  override def allRecipes: List[Recipe] = List(FruitSalad)

  override def allCategories: List[SimpleDatabase.FoodCategory] = categories

  private val categories = List(FoodCategory("fruits", List(Apple, Orange)), FoodCategory("misc", List(Cream, Sugar)))
}
