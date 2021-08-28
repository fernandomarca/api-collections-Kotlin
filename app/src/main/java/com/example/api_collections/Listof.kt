package com.example.api_collections

fun main() {
    val Joao = Funcionario("joao",1000.0, "clt")
    val Pedro = Funcionario("pedro",20000.0, "pj")
    val Fer = Funcionario("Fer",5000.0,"clt")

    val funcionarios = listOf(Joao,Pedro,Fer)

    funcionarios.forEach{ println(it)}
    println(funcionarios.find { it.nome == "joao" })

    println("###############")
    funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("###############")
    funcionarios.groupBy { it.tipo }.forEach{println(it)}

}

data class Funcionario(
    val nome:String,
    val salario:Double,
    val tipo:String
){
    override fun toString():String =
        """
            Nome:    $nome
            Salario: $salario
        """.trimIndent()
}