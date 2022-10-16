package white.ch7

import java.io.{FileNotFoundException, IOException}

object Chapter7 extends App {
  try {
    val filesHere = new java.io.File(".").listFiles
    for (file <- filesHere)
      throw new RuntimeException()
  } catch {
    case ex: FileNotFoundException => println("FileNotFoundException")
    case ex: IOException => println("IOException")
    case _ => println("Cannot")
  }

  println(new Refactoring().multiTable())
}

