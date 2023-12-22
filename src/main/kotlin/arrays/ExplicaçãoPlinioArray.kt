package arrays

fun main() {
    val salarios = doubleArrayOf(1000.0, 1100.0, 2000.0, 3000.0)
    val aumento = 1.1
    exibirAListaDeFormaComplicada(salarios, aumento)
    exibeAListaDeFormaSimples(salarios,aumento)

}
fun exibirAListaDeFormaComplicada (salarios: DoubleArray, aumento: Double) {

    var indice = 0 // essa variavel representa o indice de cada item da sua coleção (nesse caso um array)

    // for usado para fazer calculos , da pra fazer de várias formas , essa é só uma das possibilidades.
    for (salario in salarios) {
        salarios[indice] = salarios[indice] * aumento
        indice++
    }

    // contentToString() é uma função do Kotlin Collections ( só serve para coleções) que transforma sua coleção em string
    // é só uma forma de exibir a coleção em string.
    // Existem várias dessas funçoes que só são possiveis de serem usadas em coleções. Cada uma com um uso diferente
    // Repare que ela só ira funcionar com coleções, não com um único item, pra issi ja temos o toString()
    println(salarios.contentToString())
}

//forEachIndexed faz o mesmo que o for da outra função , mas é mais legivel, e simples.
//só é possivel usar em colções.
//ele ira repetir o que esta dentro do seu escopo {} assim assim como o for ,
//com a diferença que ele tb entrega pra vc o indice de cada item da coleção
//então na primeira vez que o programa repetir o que esta dentro do escopo dele o indice será 0 depois 1 até acabar.
//no nosso caso aqui o salario do indice 0 ira receber ele mesmo como o aumento.

fun exibeAListaDeFormaSimples ( salarios: DoubleArray, aumento: Double) {
    salarios.forEachIndexed { indice, salario ->
        salarios[indice] = salario * aumento
    }
    println(salarios.contentToString())
}