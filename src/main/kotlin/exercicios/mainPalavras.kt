package exercicios

fun main() {
    val texto =  "Estou tentando criar uma lista que indique quantas palavras existem nesse texto, e qual a quantidade de cada palavras escrita nesta frase."



    val textoSemPonto = texto.replace(".", "")
    val textoLimpo = textoSemPonto.replace(",", "")

    val textoDividido = textoLimpo.split(" ")

    val agrupandoPalavras = textoDividido.groupingBy { it }.eachCount()
    println("$agrupandoPalavras")

    agrupandoPalavras.forEach{(palavra, contagem) ->
        println("$palavra : $contagem")
    }






}

