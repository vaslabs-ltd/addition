import org.scalatest._
import flatspec._
import matchers._

class MathOpsSpec extends AnyFlatSpec with must.Matchers {
  "Adding 5 and 8" must "give 13" in {
    MathOps.addTwoNumbers(5, 8) mustEqual 13
  }

  "Multiplying 5 and 8" must "give 40" in {
    MathOps.multiplyTwoNumbers(5, 8) mustEqual 40
  }

  "Multiplying 7 and 9" must "give 63" in {
    MathOps.multiplyTwoNumbers(7, 9) mustEqual 63
  }

  "Adding 5 and 8 and then multiplying the result by 3" must "give 39" in {
    MathOps.multiplyTwoNumbers(MathOps.addTwoNumbers(5, 8), 3) mustEqual 39
    val multiplyBy3: Int => Int = result => MathOps.multiplyTwoNumbers(result, 3)

    val addAndThenMultiplyBy3: ((Int, Int)) => Int = MathOps.addTwoNumbers.tupled andThen multiplyBy3
    addAndThenMultiplyBy3(5, 8) mustEqual 39
    val composeMultiplyBy3WithAddTwoNumbers = multiplyBy3 compose MathOps.addTwoNumbers.tupled

    composeMultiplyBy3WithAddTwoNumbers(5, 8) mustEqual 39
  }
}