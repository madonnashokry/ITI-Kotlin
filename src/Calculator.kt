class Calculator {
    fun start() {
        println("Select an operation:")
        println("1: Add")
        println("2: Subtract")
        println("3: Multiply")
        println("4: Divide")

        val choice = readLine()!!.toInt()

        println("Enter first number:")
        val num1 = readLine()!!.toDouble()

        println("Enter second number:")
        val num2 = readLine()!!.toDouble()

        when (choice) {
            1 -> println("Result: ${add(num1, num2)}")
            2 -> println("Result: ${subtract(num1, num2)}")
            3 -> println("Result: ${multiply(num1, num2)}")
            4 -> println("Result: ${divide(num1, num2)}")
            else -> println("Invalid choice, please try again.")
        }


    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {

        return     a / b
    }
}