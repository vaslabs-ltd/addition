@main def mathOps(a: Int, operation: String, b: Int) =
    val operationFunction = MathOpsInput.parse(operation)
    val result = operationFunction(a, b)
    println(s"${a} ${operation} ${b} = $result")
