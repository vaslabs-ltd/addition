import org.scalatest._
import flatspec._
import matchers._

class MathOpsSpec extends AnyFlatSpec with must.Matchers {
  "Adding 5 and 8" must "give 13" in {
    MathOps.addTwoNumbers(5, 8)
  }
}
