package white.ch29.recipe

trait SimpleFood {
  object Pear extends Food("Pear")

  def allFoods: List[Food] = List(Apple, Pear)
  def allCategories = Nil
}
