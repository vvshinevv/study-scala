package white.ch29.recipe

trait FoodCategories {

  case class FoodCategory(name: String, foods: List[Food])

  def allCategories: List[FoodCategory]

}
