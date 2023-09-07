package com.evzapp.proyecto1.sintaxis

fun main(){
    ifBoolean()
}

fun ifBasico(){
    var name = "Esteban"
    if(name == "Esteban"){
        println("la variables name es $name")
    }else{
        println("no es correctooooo")
    }
}

fun ifAnidado(){
    var animal = "dog"
    if(animal.lowercase() == "dog"){
        println("The animal is a dog")
    }else if(animal.lowercase() == "cat"){
        println("The animal is a cat")
    }else if(animal.lowercase() == "bird"){
        println("The animal is a bird")
    }else{
        println("the animal is none of the know")
    }
}

fun ifBoolean(){
    var buttonPressed = true
    // con ! al principio es igual a false
    if (buttonPressed){
        println("pressed")
    }else if (!buttonPressed){
        println("not preseed")
    }
}

fun ifMultipleAnd(){
    var age = 18
    var permission = false

    if ( age >= 18 && permission){
        println("He can Drink")
    }else{
        println("He can't Drink")
    }
}

fun ifMultipleOr(){
    var age = 18
    var permission = false

    if ( age >= 18 || permission){
        println("He can Drink")
    }else{
        println("He can't Drink")
    }
}