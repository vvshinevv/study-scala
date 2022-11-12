package white.ch10

import white.ch10.Element.elem

abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def beside(that: Element): Element = {
    elem(for ((line1, line2) <- this.contents zip that.contents) yield line1 + line2)
  }

  def above(that: Element): Element = elem(this.contents ++ that.contents)

  override def toString: String = contents mkString "\n"
}

object Element {
  private class LineElement(s: String) extends ArrayElement(Array(s)) {
    override def height: Int = s.length

    override def width: Int = 1
  }

  private class ArrayElement(val contents: Array[String]) extends Element

  private class UniformElement(ch: Char, override val width: Int, override val height: Int) extends Element {
    private val line = ch.toString * width

    override def contents: Array[String] = Array.fill(height)(line)
  }


  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)

  def elem(line: String): Element = new LineElement(line)
}
