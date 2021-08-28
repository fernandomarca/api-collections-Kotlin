package com.example.api_collections
import java.text.DecimalFormat

fun main() {
    val dec = DecimalFormat("#,###.00") //2 casas decimais no final separado milhar "." e decimais ","

    val salarios  = doubleArrayOf(5106.656,15048.12369,1895.45969, 3480.67820)
    salarios.sort()// ordenação crescente do array
    for (salario in salarios){
        println("R$ ${dec.format(salario)}")
        println("${"%.2f".format(salario)}")
    }

    val pi = 3.14159265358979323
    val s = "pi = %.2f".format(pi)
    println(s)
}