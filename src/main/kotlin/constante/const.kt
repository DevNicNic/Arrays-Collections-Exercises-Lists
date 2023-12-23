package constante

val CONST_1 = 10
const val CONST_2 = 10

// O Const é usado para top level declaration, que é algo que não esta
// em classe , algo que esta no maior escopo possivel, ou seja
// aoconst esta sempre fora de qualquer classe ou fun. Em cima no topo do código.

class Const {

    val ABC = "" // se vc tem algo que necessita ser usado como uma constante dentro da classe então use
    // somente Val.
    companion object{
        const val abc = false   //  const não deve ser usado dentro de uma classe mas pode ser usado
        // dentro de um companion object ou object.
    }
}

// O const é algo que é esperado fora no topo do código é algo que vai se compartilhado entre todos os arquivos.
// Estará disponivel para todas as classes.
// O val é usado dentro de classes e métodos.
// O const precisa ser um valor inicializado sempre em tempo de compilação ou seja ela deve ter um valor definido sempre.

fun main() {

}