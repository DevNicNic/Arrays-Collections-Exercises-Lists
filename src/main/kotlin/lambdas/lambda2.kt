package lambdas

fun main() {

    val a = { println("Hello")
    println("Tanana")

    } // um lambda sem parâmetro , temos aqui somente o corpo
    receiveA (a)

    val b = { x : Int -> x * x }
    receiveB (b)

    val c = { x : Int, y : Int ->
        println("Executando")
        x * y
    }
    receiveC(c)

}
// forma de mostrar que vc esta recebendo uma função.
// () -> Unit , tipo de parâmetro e tipo de retorno (Corpo)
fun receiveA (lambda: () -> Unit ) {
    lambda ()
}
fun receiveB (tt:(x:Int) -> Int) {}
fun receiveC (lamb: (x:Int, y:Int)-> Int) {}