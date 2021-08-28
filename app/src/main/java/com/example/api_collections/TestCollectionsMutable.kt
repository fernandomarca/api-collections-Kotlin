package com.example.api_collections

fun main() {
    val Joao = Funcionario("joao",1000.0, "clt")
    val Pedro = Funcionario("pedro",20000.0, "pj")
    val Fer = Funcionario("Fer",5000.0,"clt")

    val funcionarios = mutableListOf(Joao, Pedro)

    funcionarios.forEach(){
        println(it)
    }

    println("###########################################")
    funcionarios.add(Fer)
    funcionarios.forEach(){
        println(it)
    }

    println("###########################################")
    funcionarios.remove(Joao)
    funcionarios.forEach(){
        println(it)
    }

    println("################Mutable-Set################")

    val funcionariosSet = mutableSetOf(Joao)
    funcionariosSet.add(Fer)
    funcionariosSet.forEach{println(it)}
}