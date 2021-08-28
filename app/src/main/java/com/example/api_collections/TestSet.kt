package com.example.api_collections

import com.example.api_collections.Funcionario

fun main() {

    val Ricardo = Funcionario("Ricardo",1000.0, "clt")
    val Vera = Funcionario("Vera",20000.0, "pj")
    val Fer = Funcionario("Fer",5000.0,"clt")

    val funcionarios1 = setOf<Funcionario>(Ricardo,Vera)
    val funcionarios2 = setOf<Funcionario>(Fer)
    val funcionarios3 = setOf<Funcionario>(Vera)

    val funcionarios = funcionarios1.union(funcionarios2)

    funcionarios.forEach{
        println(it)
    }

    println("#######################################")

    val funcionariosSub = funcionarios.subtract(funcionarios3)

    funcionariosSub.forEach{
        println(it)
    }

    println("#######################################")

    val funcionariosInterset = funcionarios.intersect(funcionarios3)

    funcionariosInterset.forEach{
        println(it)
    }
}