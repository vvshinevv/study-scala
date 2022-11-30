package white.ch19.generic

class BoxHandler {

  def output(box: Box[Toy]): Toy = {
    box.get()
  }

  def input(box: Box[Toy], toy: Toy): Unit = {
    box.set(toy)
  }
}
