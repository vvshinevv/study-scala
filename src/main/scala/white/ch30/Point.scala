package white.ch30

class ColoredPoint(x: Int, y: Int, val color: Color.Value) extends Point(x, y) {
  override def equals(obj: Any): Boolean = obj match {
    case that: ColoredPoint => this.color == that.color && super.equals(that)
    case _ => false
  }
}

case class Point(x: Int, y: Int) {
  override def hashCode(): Int = (x, y).##

  override def equals(obj: Any): Boolean = obj match {
    case that: Point =>
      this.x == that.x && this.y == that.y && this.getClass == that.getClass
    case _ => false
  }
}

case class MutablePoint(var x: Int, var y: Int) {
  override def hashCode(): Int = (x, y).##

  override def equals(obj: Any): Boolean = obj match {
    case that: Point => this.x == that.x && this.y == that.y
    case _ => false
  }
}


