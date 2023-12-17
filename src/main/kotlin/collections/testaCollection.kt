package collections

fun testaCopia() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("José")
    banco.salva("José")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {

    val nomes: Collection<String> get() = dados.toList()

    fun salva (nome: String){
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao () {
    val nomes: Collection<String> = mutableListOf(
        "Nicole",
        "Zéca",
        "Regina",
        "José",
        "Israel",
        "Rafael"
    )
//    nomes.add("Paulo") no caso de uma referencia mutavel.
//    nomes.remove("José")
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Nicole? ${nomes.contains("Nicole")}")
    println("Tamanho da coleção : ${nomes.size}")
}