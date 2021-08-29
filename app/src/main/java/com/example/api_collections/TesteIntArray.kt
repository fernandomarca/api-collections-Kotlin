package com.example.api_collections

fun main() {
  val values = IntArray(5)
  values[0] = 1
  values[1] = 5
  values[2] = 2
  values[3] = 3
  values[4] = 4

  values.sortDescending()
  for (valor in values) {
    println(valor)
  }

  val valores = ArrayList<Int>()
  valores.add(1)
  valores.forEach() { println(it) }

//
//    values.forEach { valor -> println(valor) }

//    for(index in values.indices){
//        println("indice: $index")
//        println(values[index])
//    }


}