package white.ch12

object Chapter12 extends App {
  val queue = new MyQueue
  queue.put(-1)
  queue.put(0)
  println(queue.get())
  println(queue.get())
}
