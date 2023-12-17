package exercicios

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println("Lista de números sem filtro: $numeros")

    val listaPares = numerosPares(numeros)

    println("Lista de números pares: $listaPares")

}
fun numerosPares ( lista : List<Int>): List<Int>{
    return lista.filter { it % 2 == 0 }
}