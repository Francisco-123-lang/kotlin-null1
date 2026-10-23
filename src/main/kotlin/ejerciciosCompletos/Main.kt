package org.example.ejerciciosCompletos.ejerciciosCompletos

import org.example.ejerciciosCompletos.ejercicio1
import org.example.ejerciciosCompletos.ejercicio2
import org.example.ejerciciosCompletos.ejercicio3
import org.example.ejerciciosCompletos.ejercicio4
import org.example.ejerciciosCompletos.ejercicio5
import org.example.ejerciciosCompletos.ejercicio6

fun main() {

    //Ejercicio1:
    println("La respuesta es ${ejercicio1(null)}")
    println("La respuesta es ${ejercicio1(3)}")


    //Ejercicio2:
    println("La respuesta es: ${ejercicio2(null)}")
    println("La respuesta es: ${ejercicio2("Jobariwazaaa")}")


    //Ejercicio3:
    println("La respuesta es: ${ejercicio3(null)}")
    println("La respuesta es: ${ejercicio3("Wazijobarii")}")

    //Ejercicio4 + ejemplo de cómo hacer una lista con null interior en Kotlin:
    val lista: List<Int?> = listOf(null)
    println("La respuesta es: ${ejercicio4(lista)}")
    println("La respuesta es: ${ejercicio4(listOf(1, 4, 3, 5))}")

    //Ejercicio5

    println("La respuesta es: ${ejercicio5(null)}")
    println("La respuesta es: ${ejercicio5(listOf(1.2,2.0,3.3))}")
    //println("La respuesta es: ${ejercicio5(listOf(null))}")

    //Ejercicio7
    println("La respuesta es: ${ejercicio6(null)}")
    println("La respuesta es: ${ejercicio6(listOf(1,2,3))}")

}