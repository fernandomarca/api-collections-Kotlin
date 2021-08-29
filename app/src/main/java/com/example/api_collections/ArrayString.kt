package com.example.api_collections

fun main() {
  val nomes = Array(3) { "" }
  nomes[0] = "Maria"
  nomes[1] = "Zoião"
  nomes[2] = "José"

  for (nome in nomes) {
    println(nome)
  }

  val nomes2 = arrayOf("maria", "Zazá", "Pedro")
  nomes2.sort()
    
  for (nome in nomes2) {
    println(nome)
  }
}