package br.com.kassiano.extensionfunctions

class Carro {
    fun acelerar() { }
    fun frear() { }
}

fun Carro.re() {
}


class EmailValidator {
    fun isValidEmail(value: String): Boolean {
        return true
    }
}

private fun Int.dividir(n: Int): Int {
    return this / n
}

fun main() {

    val nomeUsuario = "Kassiano"

    EmailValidator().isValidEmail("kassiano.resende@gmail.com")


    val carro = Carro()

    val idade = 30

    10.ehPar()

    idade.ehPar()

}
