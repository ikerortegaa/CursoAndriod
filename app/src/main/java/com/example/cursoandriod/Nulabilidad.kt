package com.example.cursoandriod

fun main(){
    var name:String? = "Hola que tal"
    println(name?.get(3) ?: "Es nulo");
}