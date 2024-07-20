//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val calculator = Calculator()
    val fullNamePrinter = fullnameprint()
    val temperatureConverter = tempConverter()
    while (true) {
        println("Select a task:")
        println("1: Calculator")
        println("2: Print Full Name")
        println("3: Convert Celsius to Fahrenheit")
        println("4: Exit")

        when (readLine()!!.toInt()) {
            1 -> calculator.start()
            2 -> fullNamePrinter.start()
            3 -> temperatureConverter.start()
        }
    }
}
