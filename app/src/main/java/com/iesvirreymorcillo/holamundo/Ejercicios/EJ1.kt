package com.iesvirreymorcillo.holamundo.Ejercicios
import com.iesvirreymorcillo.holamundo.scan

fun main(){
    //EJ1: Calcular el area de un cubo
    println("Introduzca La longitud de los lados:");
    val n:Int = scan.nextLine().trim().toInt();

    println("La supercicie es:"+(n*n*6));
}
