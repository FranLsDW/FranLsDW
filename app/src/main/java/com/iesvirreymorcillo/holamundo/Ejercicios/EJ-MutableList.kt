package com.iesvirreymorcillo.holamundo.Ejercicios

fun main(args: Array <String>) {
    var a: MutableList<String> = mutableListOf()
    a.add(0, "Zero")
    a.add(1, "Two")
    a.add(2, "Four")
    a.add(3, "Six")
    println(a)

    if (a.contains("Zero")) a.add("Eigth")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    println(a)
}