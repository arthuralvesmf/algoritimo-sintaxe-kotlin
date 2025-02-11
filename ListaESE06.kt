fun main(){
    println("Diite o raio do círculo:")
    val raio = readLine().toDouble()

    if (raio != null) {
        val area = 3.14 * raio * raio
        println("A área do círculo é: $area")
    }
    else{
        println("Inválido.")
    }
}