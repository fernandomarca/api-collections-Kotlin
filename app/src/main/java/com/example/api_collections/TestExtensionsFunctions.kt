package com.example.api_collections

fun main() {
  val salarios = arrayOf(
    "2000".toBigDecimal(),
    "1500".toBigDecimal(),
    "4000".toBigDecimal(),
    "6000".toBigDecimal()
  )
  println(salarios.somatoria())
  println(salarios.media())


}
