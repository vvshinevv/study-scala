import scala.concurrent.ExecutionContext

case class Data[F[_]](data1: F[String])

object MainApp extends App {

  val d1 = Data("")
}

object Main {

}