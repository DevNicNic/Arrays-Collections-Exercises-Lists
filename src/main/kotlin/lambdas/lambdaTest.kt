package lambdas

fun main() {
    receiveA {
        println("Hello")
        println("Tanana")

    } // um lambda sem parâmetro , temos aqui somente o corpo

    receiveB  { x: Int ->
        x * x
    }


    receiveC { x: Int, y: Int ->
        println("Executando")
        x * y
    }


}
