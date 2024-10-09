package com.iesvirreymorcillo.holamundo.Ejercicios

import java.util.Scanner
val scan =Scanner(System.`in`);


fun main(){
    val completa= saludaA("juan");
    println(completa);

/*********************************/
    println("¿Cómo te llamas?");
    var nombre=sc.nextLine();
    println(saludaA(nombre));

}

fun saludaA(nombre:String):String{
    return "Hola $nombre"
}