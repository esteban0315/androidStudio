package com.evzapp.proyecto1.sintaxis


/**
 * VARIABLES Y VALORES
 * cuando creas e instancías una variables, está es modificable
 * pero un valor no es modificable
 * para crear un valor se utiliza la palabra reservada val
 * para crear una variables se utiliza la palabra reservada var
 */

/**
 * VARIABLES GLOBALES
 * ------------------
 * Se definen afuera y arriba de las funciones de las se quieren utilizar
 */

var age: Int = 30
var age2: Int = 33

fun main() {
    showMyAge(30)
    showMyName("Oscar")
    add(25, 76)
    val mySubtrack = subtrack(10, 5)
    println(mySubtrack)
}

/**
 * FUNCIONES
 * ---------
 * Se declaran con la palabra reservada fun
 * para llamar la variables se coloca el nombre y parentesis ejem. nombre()
 *
 */


fun showMyName(nameUser: String = "Esteban") {
    println("Me llamo $nameUser")
}

fun showMyAge(currentAge: Int) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtrack(firstNumber: Int, secondNumber: Int): Int {
    return (firstNumber - secondNumber)
}

//Para funciones pequeñas se puede simplificar en una sola línea
fun multiplicacion(firstNumber: Int, secondNumber: Int): Int = firstNumber * secondNumber

fun variablesAlfaNumericas() {
    /**
     * VARIABLES ALFANUMÉRICAS
     */

    //Char
    val charExample: Char = 'e'
    val charExample1: Char = '2'
    val charExample2: Char = '@'

    //String
    val stringExample: String = "Hola cómo vas"
}

fun variablesBooleanas() {
    /**
     * VARIABLES BOOLEANAS
     */

    //Boolean
    val booleanExample: Boolean = true
    val booleanExample1: Boolean = false
}

fun variablesNumericas() {
    /**
     * VARIABLES NÚMERICAS
     */

    // Int - desde -2,147,483,647 a 2,147,483,647
    val age: Int = 30
    var age2: Int = 30

    //Long - desde -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    //float - hasta 6 decimales
    val exampleFloat: Float = 15.6f

    //Double - soportan 14 decimales
    val exampleDouble: Double = 30.4546253214455

}

fun variablesAritmeticas() {
    /**
     * FUNCIONES ARITMETICAS
     */

    //SUMA
    println("sumar:")
    println(age + age2)

    //RESTA
    println("Resta:")
    println(age - age2)

    //MULTIPLICACIÓN
    println("Multiplicación:")
    println(age * age2)

    //DIVISIÓN
    println("División:")
    println(age / age2)
}