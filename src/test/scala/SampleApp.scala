import org.scalatest.concurrent.Eventually.eventually
import org.scalatest.funspec.AnyFunSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class SampleApp extends AnyFunSpec {
  describe("sample"){
    val xs = 1 to 3
    val it = xs.iterator
    eventually {
      it.next() shouldBe 3
    }
  }
}
