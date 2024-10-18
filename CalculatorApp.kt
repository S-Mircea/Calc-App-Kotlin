fun main() {
    println("Welcome to Simple Calculator!")

    while (true) {
        println("\nEnter an operation (+, -, *, /) or 'q' to quit:")
        val operation = readLine()

        if (operation == "q") {
            println("Thank you for using Simple Calculator. Goodbye!")
            break
        }

        if (operation !in listOf("+", "-", "*", "/")) {
            println("Invalid operation. Please try again.")
            continue
        }

        println("Enter the first number:")
        val num1 = readLine()?.toDoubleOrNull()
        println("Enter the second number:")
        val num2 = readLine()?.toDoubleOrNull()

        if (num1 == null || num2 == null) {
            println("Invalid input. Please enter valid numbers.")
            continue
        }

        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    println("Error: Division by zero!")
                    continue
                }
                num1 / num2
            }
            else -> {
                println("Invalid operation. Please try again.")
                continue
            }
        }

        println("Result: $result")
    }
}