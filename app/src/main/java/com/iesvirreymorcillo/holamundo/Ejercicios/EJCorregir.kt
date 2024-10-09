package com.iesvirreymorcillo.holamundo.Ejercicios

fun main(args:Array<String>){
    fun3();
}

fun fun1(){
    var x=1
    while(x<10){
        if(x>3){
            println("big x");
        }
        x++;//AÑADIR PARA SALIR DEL BUCLE
    }
}

fun fun2(){
    var x=10//CON VAL ES CONSTANTE Y NO PODRIA CAMBIA EL VALOR
    while(x>1){
        x = x - 1
        if(x<3)println("smasll x");
    }
}

fun fun3(){
    var x=10
    while(x>1){
        x = x - 1
        //NECESITA ELSE al tener bloque en el print
        //print(if(x<3)"small x")
        print(if(x<3)"small x" else "")
    }
}