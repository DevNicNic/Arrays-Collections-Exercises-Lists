package arrays

import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
    val salarios = bigDecimalArrayOf("1500.0", "2000.0", "5000.0", "10000.0")


    println("Salarios :${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println("Salarios com aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto total com salarios no primiero mes : $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Gasto total com salarios durante 6 meses: $gastoTotal")

    val salariosOrdenados = salariosComAumento.sorted()
    println("Salarios Ordenados : $salariosOrdenados")
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3)
        .toTypedArray()
    println("3 ultimos salarios : ${tresUltimosSalarios.contentToString()}")
    val media = tresUltimosSalarios.media()

    //val media = salariosComAumento.sorted().takeLast(3).toTypedArray().media()

    println("Media dos 3 ultimos salarios: $media")

    val mediaMenoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
        .media()
    println("Medias dos 3 menores salarios: $mediaMenoresSalarios")


}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}


