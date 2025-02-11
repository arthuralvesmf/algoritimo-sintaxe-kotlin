fun main() {
    print("Quanto você ganha por hora? ")
    val valorHora = readLine()!!.toDouble()

    print("Quantas horas você trabalhou no mês? ")
    val horasTrabalhadas = readLine()!!.toDouble()

    val salarioMensal = valorHora * horasTrabalhadas
    println("O seu salário mensal é: R$ %.2f".format(salarioMensal))
}
