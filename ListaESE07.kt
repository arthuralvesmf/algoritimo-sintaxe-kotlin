fun main() {
    
print("Digite o valor do lado do quadrado: ")
    val lado = readLine()!!.toDouble()
    val area = lado * lado
    val dobroArea = area * 2
    
println("A área do quadrado é $area e o dobro dessa área é $dobroArea")
}
