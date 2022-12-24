package white.ch30

import scala.collection.mutable

object Chapter30 extends App {
  val p1, p2, p3, p4 = Point(1, 2)
  val hashSet = mutable.HashSet(p1)

  val result1 = hashSet contains p2
  println(result1)

  val result2 = hashSet contains p3
  println(result2)

  val result3 = hashSet contains p4
  println(result3)

  println("=====================")
  val mutablePoint = MutablePoint(1, 2)
  val coll = collection.mutable.HashSet(mutablePoint)

  val result4 = coll contains mutablePoint
  println(result4)

  mutablePoint.x += 1
  val result5 = coll contains mutablePoint
  println(result5)

  println("====================")
  val p = Point(1, 2)
  val cp = new ColoredPoint(1, 2, Color.Red)

  println(p == cp)
  println(cp == p)

  println("====================")
  val redPoint = new ColoredPoint(1, 2, Color.Red)
  val bluePoint = new ColoredPoint(1, 2, Color.Blue)


}
