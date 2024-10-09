package com.iesvirreymorcillo.holamundo.Ejercicios

fun main(){
    var c1=Cancion("TNT","AC/DC");
    var c2=Cancion("Paradise city","Guns n Roses");
    var c3=Cancion("Black dog","Led Zeppelin");

    var misCanciones= arrayOf(c1,c2,c3);

    //(1) Play el objeto2 (2) Stop el objeto2 (3) Play el objeto3
    misCanciones[1].play();
    misCanciones[1].stop();
    misCanciones[2].play();
}

class Cancion(val titulo:String, val artista:String){

    fun play(){
        println("Está sonando $titulo, de $artista")
    }

    fun stop(){
        println("$titulo se ha parado");
    }
}