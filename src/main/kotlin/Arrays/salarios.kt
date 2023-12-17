package Arrays

fun main() {
//    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
//
//    val aumento = 1.1 // 10%
//
//    for (salario in salarios) { //cada salario dentro de salarios a gente vai fazer alguma coisa
//        val salarioAumento = salario * aumento
//        println(salarioAumento)
//    }
//    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
//
//    val aumento = 1.1 // 10%
//    var indice = 0

//    for (salario in salarios) { //cada salario dentro de salarios a gente vai fazer alguma coisa
//         salarios[indice] = salario * aumento
//        indice++
//
//    }
//    println(salarios.contentToString())

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1 // 10%

    for (indice in salarios.indices){
        salarios[indice] = salarios[indice] * aumento
    }
    println(salarios.contentToString())

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }
    println(salarios.contentToString())
}


// para usarmos ponto flutuante temos que criar um array Double
//vamos calcular o aumento usando o laço for
//