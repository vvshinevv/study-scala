package white.ch09

import java.io.File

object FileMatcher {
  private def filesHere: Array[File] = (new java.io.File(".")).listFiles

  def filesMatching(matcher: String => Boolean): Array[File] = {
    for (file <- filesHere if matcher(file.getName)) yield file
  }

  def filesEnding(query: String): Array[File] = filesMatching(_.endsWith(query))
  def filesExist(query: String): Array[File] = filesMatching(_.endsWith(query))
}
