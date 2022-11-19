package white.ch09

import java.lang.Thread.sleep

object Chapter09 extends App {

  val x = 5
//  boolAssert(x / 0 == 0)\

  boolMethodAssert(() => {
    println("boolMethodAssert")
    x / 0 == 0
  })

  def boolMethodAssert(predicate: () => Boolean): Unit = {
    println("aa")
    println(flag)

    if (flag && !predicate())
      throw new AssertionError()
  }

  callByNameBoolAssert {
    println("callByNameBoolAssert")
    x / 0 == 0
  }

  val flag = true
  def boolAssert(predicate: Boolean): Unit = {
    if (flag && !predicate)
      throw new AssertionError()
  }



  def callByNameBoolAssert(predicate: => Boolean): Unit = {
    if (flag && !predicate)
      throw new AssertionError()
  }

}

