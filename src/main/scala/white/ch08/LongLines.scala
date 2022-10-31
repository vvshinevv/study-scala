package white.ch08

import scala.io.Source

object LongLines {
  def processLine(filename: String, width: Int, line: String) = {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }

  def processFile(filename: String, width: Int) = {
    val source = Source.fromFile(filename)
    for (line <- source.getLines())
      processLine(filename, width, line)
  }
}
