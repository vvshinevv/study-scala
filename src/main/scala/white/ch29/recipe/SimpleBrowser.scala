package white.ch29.recipe

object SimpleBrowser {
  def recipesUsing(food: Food): List[Recipe] = SimpleDatabase.allRecipes.filter(recipe => recipe.ingredients.contains(food))
}
