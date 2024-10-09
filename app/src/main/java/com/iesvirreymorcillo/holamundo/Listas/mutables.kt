package com.iesvirreymorcillo.holamundo.Listas


fun main(){
    var comida= mutableListOf("Pizza","Hamburguesa","Patatas")
    //Añadir al final
    comida.add("spaghetti");println(comida)
    //Añade un elemento en una posición determinada
    comida.add(0, "spaghetti");println(comida)
    //Concatenar Listas
    val masComida = listOf("ravioli", "lasagna", "fettuccine")
    comida.addAll(masComida);println(comida)
    //Eliminar el primer regstro coincidente
    comida.remove("spaghetti");println(comida)
    //Eliminar por posicion
    comida.removeAt(0);println(comida)
    //Vaciar y comprobar
    //comida.clear();
    //println(comida.isEmpty())
}