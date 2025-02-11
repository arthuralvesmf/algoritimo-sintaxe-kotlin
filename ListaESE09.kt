fun main() {
    print("Digite a temperatura em graus Fahrenheit: ")
    val fahrenheit = readLine()!!.toDouble()

    val celsius = 5 * (fahrenheit - 32) / 9
    println("A temperatura em graus Celsius é: %.2f".format(celsius))
}
