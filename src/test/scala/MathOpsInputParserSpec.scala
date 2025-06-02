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

  "no extra operands" must "not apply any operations" in {
    val nextOperand = MathOpsInput.parse(Seq.empty)
    nextOperand.apply(10) mustEqual 10
  }

  "extra pair of operands of multiplication and 4" must "be parsed" in {
    val nextOperand = MathOpsInput.parse(Seq("*", "5"))
    nextOperand.apply(10) mustEqual 50
  }
}
