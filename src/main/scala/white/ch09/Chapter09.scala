package white.ch09

import java.lang.Thread.sleep

object Chapter09 extends App {

  val x = 5
//  boolAssert(x / 0 == 0)
  boolMethodAssert(() => {
    println("boolMethodAssert")
    x / 0 == 0
  })
  callByNameBoolAssert {
    println("callByNameBoolAssert")
    x / 0 == 0
  }

  var flag = true
  def boolAssert(predicate: Boolean): Unit = {
    if (flag && !predicate)
      throw new AssertionError()
  }

  def boolMethodAssert(predicate: () => Boolean): Unit = {
    if (flag && !predicate())
      throw new AssertionError()
  }

  def callByNameBoolAssert(predicate: => Boolean): Unit = {
    if (flag && !predicate)
      throw new AssertionError()
  }

  def a: Int = {
    1
  }

  def bbbb() :Int = {
    2
  }

  a
  bbbb()

  sleep(100)
}

