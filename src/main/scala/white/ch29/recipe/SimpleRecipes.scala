package white.ch29.recipe

trait SimpleRecipes {
  this: SimpleFood =>

  object FruitSalad extends Recipe(
    "fruit salad",
    List(Apple, Pear),
    "Mix it all together"
  )

  def allRecipes: List[Recipe] = List(FruitSalad)
}
