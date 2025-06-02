@main def mathOps(a: Int, operation: String, b: Int, extraArgs: String*) =
    val operationFunction = MathOpsInput.parse(operation)
    val nextOperand = MathOpsInput.parse(extraArgs)
    val result = (operationFunction.tupled andThen nextOperand)(a, b)
    val extraArgsOut = extraArgs.mkString(" ", " ", "")
    println(s"${a} ${operation} ${b}${extraArgsOut} = $result")
