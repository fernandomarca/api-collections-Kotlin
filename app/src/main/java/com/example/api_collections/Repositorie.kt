package com.example.api_collections

class Repositorie<T> {
    private val map = mutableMapOf<String,T>()

    fun create(id:String,value:T){
//        map.put(id,value)
        map[id]=value
    }

    @Throws(Error::class)
    fun findById(id:String): T? {
        val find = map.get(id)
        if(find == null){
            throw Error("não encontrado")
        }
        return map[id]
    }

    fun findAll():MutableCollection<T>{
        return map.values
    }

    fun remove(id:String){
        map.remove(id)
    }
}