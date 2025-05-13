object MathOpsInput {
  def parse(operationString: String): (Int, Int) => Int = 
    if (operationString == "+")
        MathOps.addTwoNumbers
    else if (operationString == "*")
        MathOps.multiplyTwoNumbers
    else
        throw new RuntimeException("Only multiplication (*) and addition (+) operations are supported!")
}