import org.scalatest._
import flatspec._
import matchers._

class MathOpsInputParserSpec extends AnyFlatSpec with must.Matchers {
  "the + character" must "result to an addition of 2 numbers" in {
    val operation = MathOpsInput.parse("+")
    operation(5, 11) mustEqual 16
  }

  "the * character" must "result to an addition of 2 numbers" in {
    val operation = MathOpsInput.parse("*")
    operation(5, 11) mustEqual 55
  }

  "any character other than + or *" must "result in an error" in {
    assertThrows[RuntimeException] {
        MathOpsInput.parse("o")
    }
  }
}
