class tempConverter {
    fun start() {

        println("Enter temp in celsius : ")
        val celsius = readLine()!!.toDouble()
        val ferhinitetemp = celsius * 9 / 5 + 32
        println("Tempreture in fehrinite = $ferhinitetemp")


    }
}