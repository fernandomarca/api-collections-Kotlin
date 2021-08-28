package com.example.api_collections

fun main() {
    val salarios = DoubleArray(4)

    salarios[0]=1000.0
    salarios[1]=3000.0
    salarios[2]=6000.0
    salarios[3]=4000.0


    salarios.forEachIndexed{
        index,salario -> salarios[index] = salario * 1.1
    }

    salarios.forEach {
        println(it)
    }
    println("menor salario ${salarios.minOrNull()}")
    println("maior salario ${salarios.maxOrNull()}")
    println("média salarial ${salarios.average()}")

    val salariosMaiorQue1500= salarios.filter { it>1500 }
    salariosMaiorQue1500.forEach(::println)

    println("-------------------------")
    println(salarios.count{it in 1500.0..5000.00})

    println("-------------------------")
    println(salarios.find{it == 1100.0})
    println(salarios.find{it == 1500.0})
    println(salarios.any{it == 1100.0}) //algum elemento satisfaz false/true?
    println(salarios.any{it == 1200.0}) //algum elemento satisfaz false/true?


}