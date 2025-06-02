object MathOpsInput {
  def parse(operationString: String): (Int, Int) => Int = 
    if (operationString == "+")
        MathOps.addTwoNumbers
    else if (operationString == "*")
        MathOps.multiplyTwoNumbers
    else
        throw new RuntimeException("Only multiplication (*) and addition (+) operations are supported!")

  def parse(elements: Seq[String]): Int => Int = { input =>
    if (elements.size == 2) {
        val firstElement = elements.head
        val secondElement = elements(1).toInt
        val operation = parse(firstElement)
        operation(input, secondElement)
    } else
        input
  }
}