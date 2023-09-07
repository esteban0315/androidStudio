package com.evzapp.proyecto1.sintaxis


fun main(){
//    inmutableList()
    mutableList()
}

fun mutableList(){
    val weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo")
    weekDays.add(0, "EvzDay")
    println(weekDays)

    if (weekDays.isEmpty()){
        //no hay nada
    }else{
        weekDays.forEach { println(it)}
    }
    if (weekDays.isNotEmpty()){
        weekDays.forEach { println(it) }
    }
}
fun inmutableList(){
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sábado","Domingo")
//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly[0])
//   println(readOnly.last())
//    println(readOnly.first())

    val example = readOnly.filter { it.contains("a") }
//    println(example)

//    readOnly.forEach {weekday -> println(weekday)}

}