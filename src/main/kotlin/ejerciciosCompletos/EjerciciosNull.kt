package org.example.ejerciciosCompletos

fun ejercicio1(num: Int?): Int {
    return num?: 0
}

fun ejercicio2(nombre: String?): String {
    return nombre?: "Nombre desconocido "
}
//
fun ejercicio3(nombre: String?): String? {
    return nombre
}

fun ejercicio4(lista: List<Int?>): Int? {
    return lista.first()
}

fun ejercicio5(lista: List<Double>?): Double? {
    return lista?.average()
}

fun ejercicio6(lista: List<Int>?): Int? {
    return lista?.let {lista.max()}
}