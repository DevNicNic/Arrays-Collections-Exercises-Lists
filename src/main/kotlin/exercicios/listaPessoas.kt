package exercicios

fun main() {
    val listaPessoas = listOf(
        Pessoa("Nicole", 37, "Marinque"),
        Pessoa("Plinio", 37, "Uberlandia"),
        Pessoa("Zeca", 2, "Cotia")
    )
    println("Lista de Pessoas")
    listaPessoas.imprimiCerto()
    println()

    val novaPessoa = Pessoa("Alan", 38, "Barra Mansa")

    val novaListaDePessoas = adicionarPessoa(listaPessoas, novaPessoa)


    println("Lista Atualizada")
    novaListaDePessoas.imprimiCerto()


}

data class Pessoa(val nome: String, val idade: Int, val cidade: String)

fun adicionarPessoa(lista: List<Pessoa>, novaPessoa: Pessoa): List<Pessoa> {
    val novaLista = lista.toMutableList()
    novaLista.add(novaPessoa)
    return novaLista
}
fun List<Pessoa>.imprimiCerto (){
    val pulaLinha = this.joinToString ( "\n" ){
        "${it.nome}, ${it.idade}, ${it.cidade}"
    }
    println("=====PESSOAS=====\n$pulaLinha")
}