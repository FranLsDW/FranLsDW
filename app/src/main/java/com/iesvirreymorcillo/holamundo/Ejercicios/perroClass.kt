package com.iesvirreymorcillo.holamundo.Ejercicios

class Perro (val nombre:String, var peso:Double,val raza:String){
    fun ladrar() {
        println(if (peso < 20) "guau guau" else "GUAU GUAU")
    }

    override fun toString(): String {
        return "$nombre, pesa $peso y es un $raza";
    }
}

fun main(){
    var p1=Perro("Tobby",15.5,"Dalmata");
    var p2=Perro("Rocky",25.5,"Pastor Aleman");

    var misPerros= arrayOf(p1,p2);

    misPerros[1].peso=30.0;
    misPerros[1].ladrar();

    println(misPerros[0])
    println(misPerros[1])

}