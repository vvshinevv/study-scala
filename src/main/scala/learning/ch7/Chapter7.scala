package learning.ch7

import java.io.File

object Chapter7 {
  def main(args: Array[String]): Unit = {
    1 :: 2 :: Nil
    inc(1)
  }

  def map(): Unit = {
    val files = new File("./src/main/scala/ch7").listFiles()
    val scala1 = files.map(f => f.getName).filter(f => f.endsWith("scala"))
    val scala2 = files map {
      _.getName
    } filter {
      _.endsWith("scala")
    }
    val scala3 = files map (_.getName) filter (_.endsWith("scala"))


    scala3.foreach(f => {
      printf(f + " ")
    })
  }

  def inc(i: Int): Stream[Int] = Stream.cons(i, inc(i + 1))

  def inc1(i: Int): LazyList[Int] = LazyList.cons(i, inc1(i + 1))
}
