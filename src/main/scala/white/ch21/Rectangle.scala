package white.ch21

case class Rectangle(width: Int, height: Int) {
  implicit class RectangleMaker(width: Int) {
    def x(height: Int) = Rectangle(width, height)
  }


}
