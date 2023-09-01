package com.evzapp.proyecto1

fun main() {
    var name:String = "Esteban"
    // a veces una variable puede ser nula
    var name2:String? = null
    // se puede comprobar de la siguiente forma para no romper el código
    //lo que se hace es colocarle el ? a la variable que se tiene sospecha que sea nulo antes de continuar
    // y esto se leería: si name no es nulo entonces trae la 3 letra, si es nulo imprime el mensaje
    println(name2?.get(3) ?: "Es nulo")
}