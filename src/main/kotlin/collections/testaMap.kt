package collections

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 64.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
    )
    //COMPORTAMENTOS ESPECIFICOS DO MAP
//    val valorPedido = pedidos.getValue(5) // mais interessante de q somente o get porque ele retorna uma exception se for nulo
//    println(valorPedido)

    //println(pedidos + (7 to 90)) possibilidade de soma

    val mensagem: Double? = pedidos.getOrElse(0, { //serve para deixar um valor padrão caso a chave não exista
        0.0
    })
    println(mensagem)
    println(pedidos.getOrDefault(1, -1.0)) // outra maneira de adicionar um valor padrao quando a chave não existe
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys) // acesso a todas as chaves

    for (numero in pedidos.keys) {
        println("pedido: $numero")
    }

    println(pedidos.values) // acesso a todos os valores

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) -> //temos q fazer o filtro como se foce um pair
        numero % 2 == 0 && valor > 70.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
//    println(pedidos)

    pedidos += (listOf(7 to 90.0, 8 to 20.0, 8 to 30.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0) // quando tiver valores iguais ele vai remover somente o primeiro q encontrar
    println(pedidos)


    pedidos -= 6
    print(pedidos)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido: Double? = pedidos[3]
    // se o valor de pedido não for nulo vai executar o que esta no let
    pedido?.let {//nessa caso o it é isado como padrão , eu poderia escrever 'pedid0 ->
        println("Pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) { // nesse caso o entry faz parte do tipo, ele tá falando q o tipo de p é um map com entradas de tipo <Int  Double>
        println("Numero do p : ${p.key}")
        println("valor do p : ${p.value}")

    }
    //isto é uma inserção, estou adicioanndo mais uma chave e valor.
    pedidos[4] = 70.0
    println(pedidos)

    pedidos.put(5, 80.0)
    println(pedidos)

    pedidos[1] = 100.0 // muda o valor de um pedido que ja existe
    println(pedidos)

    pedidos.putIfAbsent(6, 200.0) // tb insere um novo pedido e valor
    println(pedidos)

    pedidos.putIfAbsent(6, 300.0) //não muda o valor ja existente no pedido existente
    println(pedidos)

    pedidos.remove(6) // remove o pedido 6
    println(pedidos)
    pedidos.remove(3, 50.0) //só vai remover se a chave e o valor for igual
    println(pedidos)


}
