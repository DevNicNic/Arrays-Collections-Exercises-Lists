package Arrays

fun main() {

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)
    val maiorIdade = idades.max() // calcula a maior idade utilizando a função max()
    println("Maior idade : $maiorIdade")

    val menorIdade = idades.min() // calcula a menor idade utilizando a função min()
    println("Menor idade: $menorIdade")

    val media: Double = idades.average() // calcula a média entrea as idades
    println("Media entre as idades: $media")

    val todosMaiores =
        idades.all { it >= 18 } // se todos a idades da minha lista forem maiores que 18 ele vai retornar true se não false
    println("Todos maiores? $todosMaiores")

    val existeMaior = idades.any { it >= 18 } // se pelo menos uma das idades satisfazer a condição
    println("Algum aluno é maior de idade? $existeMaior")

    val maiores = idades.filter { it >= 18 } // filtrar os valores que estabelecem a condição
    println("Maiores : $maiores")

    // vai encontrar determinado valor que estiver na condição ( o primeiro valor que satisfaça a condição)
    val busca = idades.find { it > 18 }
    println("Busca: $busca")


}
