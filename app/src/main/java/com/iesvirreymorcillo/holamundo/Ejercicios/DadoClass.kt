package com.iesvirreymorcillo.holamundo.Ejercicios

import java.util.Scanner;
val sc =Scanner(System.`in`);

class Dado(var nCaras:Int){

    fun lanzar(){
        var valor=(Math.random()*nCaras+1).toInt();
        println("Ha salido: $valor");
    }
}

fun main(){
    println("Introduzca el numero de dados que desea lanzar");
    var NDados:Int=sc.nextInt();

    for (i in 1..NDados){
        println("Introduzca el numero de caras del dado $i");
        var Ncaras:Int=sc.nextInt();
        var dado=Dado(Ncaras);
        dado.lanzar();
    }
}