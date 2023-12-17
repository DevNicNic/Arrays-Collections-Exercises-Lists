package exercicios

fun main() {
    val numerosParaSomar: List<Int> = listOf(50, 10, 30, 5, 100, 8)

    println("Nossos elementos são: $numerosParaSomar")

    val soma = numerosParaSomar.fold(0) { acumulador, elemento ->
        acumulador + elemento
    }

    println("A soma dos elemnetos da lista é: $soma")
}