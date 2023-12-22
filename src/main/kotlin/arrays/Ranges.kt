package arrays

fun main() {
    // imprime uma série de 1 a 10
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) { // operador "in" aqui vai pegar cada valor até o 10 e colocar dentro da variavel do lado esquerdo
        print("$s ")
    }
    println()
    //imprime números pares no intervalo de 2 a 100
    val numerosPares = 2.until(100) step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }
    println()
    //imprime números pares contando de forma regressiva de 100 a 0 (step 2) quer dizer pulando de 2 em 2
    val numerosParesReversos = 100 downTo 0 step 2
    numerosParesReversos.forEach { print("$it ") } // it representa cada um dos números da série

    println()
    //verifica se o valor do salário esta entre os valores da variavel intervalo.
    val intervalo = 1500.0..5000.0 // o operador (..) faz o mesmo que o "rangeTo"
    val salario = 6000.0
    if (salario in intervalo) { // o operador "in" aqui no if vai verificar se o valor que esta a esquerda esta dentro do que esta a direita
        println("Esta dentro do intervalo")
    } else {
        println("Não esta dentro do intervalo")
    }
    println()

    // vai imprimir true ou falso ( se tem ou não a letra dentro do intervalo de letra da variavel alfabeto)
    val alfabeto = 'a'..'z'
    val letra = 'K'
    println(letra in alfabeto) // nem sabia q dava pra fazer isso


}