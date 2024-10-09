package com.iesvirreymorcillo.holamundo.Listas

fun main() {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    val diasSemana: List<String> =
        listOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")

    println("First Element: ${numbers[0]}")
    println("Last Element: ${numbers[numbers.size - 1]}")

    println("¿Está el 4 en la lista? ${numbers.contains(4)}")
    println("¿Está el miercoles en la lista? ${diasSemana.contains("Miercoles")}")

    println("Lista ordenada: ${diasSemana.sorted()}")//Orden Alfabetico
    println("Lista invertida: ${numbers.reversed()}")
}