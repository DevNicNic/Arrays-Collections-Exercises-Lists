package Arrays

fun main() {
//    val idade1 = 25
//    val idade2 = 19
//    val idade3 = 33
//    val idade4 = 20
//
//    val maiorIdade = if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4){
//        idade1
//    } else if (idade2 > idade3 && idade2 > idade4){
//        idade2
//    } else if (idade3> idade4){
//        idade3
//    } else {
//        idade4
//    }
//
//    println(maiorIdade)
// ai inves de fazer desse jeito acima fica mais facil fazer como no exemplo abaixo

    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = Int.MIN_VALUE

    for (idade in idades) { //para cada idade dentro do array de idades vamos executar uma operção
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    // forEach é uma função pronta do kotlin que faz o mesmo papel do for
    var menorIdade = Int.MAX_VALUE // Int.MAX_VALUE é uma constante que tem o maior valor possivel de um inteiro
    idades.forEach { idade -> // para cada idade menor que menorIdade vai ser ela a menor idade
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(menorIdade)


}