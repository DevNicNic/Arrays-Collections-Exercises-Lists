package Lambdas

// função anônima não tem nome , e pode ser passada por parâmetro.
// sintaxe { parâmetro -> corpo }

fun abc ( x : Int) {} // função para usar de exemplo.
fun main() {

    val a = { println("Hello") } // um lambda sem parâmetro , temos aqui somente o corpo
    a ()

    val b = { x : Int -> x * x }
    b(10)

    val c = { x : Int, y : Int ->
        println("Executando")
        x * y
    }
    c( 5, 15)

}