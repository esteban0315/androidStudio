package com.evzapp.proyecto1.sintaxis

/**
 Un arreglo son secuencias de datos, que nos permite almacenar varios datos de forma seguida, en un mismo espacio.
 */
fun main(){
    //indice de 0 a 6 y tamaño 7
    var weekDays = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo")
//    println(weekDays[0])
    if(weekDays.size >= 7) println(weekDays.size) else println("no hay más valores en el array")

    //Modificar valores
    weekDays[0]="Domilnes"


    //recorrer array por bucles
    for (position in weekDays.indices){
//        println("el día de la semana es " + weekDays[position])
    }

    for ((position,value) in weekDays.withIndex()){
//        println("la posición $position, contiene $value")
    }

    for (weekDay in weekDays){
        println("ahora es $weekDay")
    }

}

