package com.example.api_collections

fun main() {
    val Joao = Funcionario("joao",1000.0, "clt")
    val Pedro = Funcionario("pedro",20000.0, "pj")
    val Fer = Funcionario("Fer",5000.0,"clt")
    val Fer2 = Funcionario("Fer",5001.0,"clt")

    val repositorie = Repositorie<Funcionario>()

    repositorie.create(Joao.nome, Joao)
    repositorie.create(Pedro.nome, Pedro)
    repositorie.create(Fer.nome, Fer)
    repositorie.create("Fer", Fer2)

    println(repositorie.findById(Pedro.nome))
    println("##################################")
    repositorie.findAll().forEach{println(it)}
    println("##################################")
    repositorie.remove(Fer.nome)
    repositorie.findAll().forEach{println(it)}
}