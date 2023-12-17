package exercicios

fun main() {
    val produtos = listOf(
        Produto(nome = "Sabão em Pó", preco = 10.0, quantidadeEstoque = 50),
        Produto(nome = "Café Pilão", preco = 15.0, quantidadeEstoque = 100),
        Produto(nome = "Sabonete", preco = 2.0, quantidadeEstoque = 200),
        Produto(nome = "Pasta de dente", preco = 5.0, quantidadeEstoque = 25),
        Produto(nome = "Caneta Azul", preco = 1.0, quantidadeEstoque = 10)
    )
    val totalEmEstoque = calcularValorTotalEmEstoque(produtos)
    println("Valor total em estoque :R$ $totalEmEstoque")

     baixoEStoque(produtos)


}
 data class Produto ( val nome: String, val preco: Double, val quantidadeEstoque: Int)

fun calcularValorTotalEmEstoque ( produtos: List<Produto>): Double {
    var valorTotal = 0.0

    produtos.forEach { produto ->
        valorTotal += produto.preco * produto.quantidadeEstoque
    }
    return valorTotal
}
fun baixoEStoque (produtos: List<Produto>)  {
    val estoqueMinimo = 30
    produtos.forEach {produto ->
        if (produto.quantidadeEstoque < estoqueMinimo){
            println("${produto.nome}: ${produto.quantidadeEstoque} unidades, QUANTIDADE BAIXA PARA ESTOQUE.")
        } else {
            println("${produto.nome}: Quantidade dentro dos padrões de estoque.")
        }
    }

}