package collections

fun testaSet() {
    val asssitiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Paulo", "Maria")
    //val assistiramAmbos: Set<String> =  asssitiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(asssitiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Ana")
    assistiramAmbos.add("Ana")
    println(assistiramAmbos)

    println(assistiramCursoKotlin + asssitiramCursoAndroid)
    println(assistiramCursoKotlin union asssitiramCursoAndroid) // praticamente a mesma coisa que o de cima

    println(asssitiramCursoAndroid - assistiramCursoKotlin)
    println(asssitiramCursoAndroid subtract assistiramCursoKotlin)

    println(assistiramCursoKotlin intersect asssitiramCursoAndroid) // pessoas q estiverem no mesmo conjunto

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet()) //vai filtar sem repitir nenhum membro
}