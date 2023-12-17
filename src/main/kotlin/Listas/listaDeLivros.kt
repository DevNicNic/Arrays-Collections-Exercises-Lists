package Listas

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão : Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha Vida de Menina",
        autor = "Helena morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memorias Poóstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"

    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = 1946
        )
    )
    livros.imprimeComMarcadores()

    livros.remove(livro1)

    livros.imprimeComMarcadores()

    val ordenadoAnoPublicação: List<Livro> = livros.sorted()
    ordenadoAnoPublicação.imprimeComMarcadores()

    val ordenadoPorTitulo = livros.sortedBy { it.titulo }
    ordenadoPorTitulo.imprimeComMarcadores()

    livros.sortedBy { it.autor }.imprimeComMarcadores()

    val titulos: List<String> = listaDeLivros
        .filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }

    println(titulos)

    val publicacoes = livros.map { it.anoPublicacao }
    println(publicacoes)


}

