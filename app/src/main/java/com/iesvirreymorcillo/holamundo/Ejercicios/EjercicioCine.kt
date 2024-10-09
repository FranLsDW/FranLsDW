package com.iesvirreymorcillo.holamundo.Ejercicios


fun main()
{
    cine(4)
    cine(17)
    cine(17, true)
    cine(32)
    cine(78)
    cine(101)

}

fun cine(edad:Int, esLunes:Boolean=false){
    if(edad<=12) println("El precio de la entrada son 3€")
    else if (edad<=60){
        if(esLunes)println("El precio de la entrada son 8€")
        else println("El precio de la entrada son 6€")
    }else if (edad>60 && edad<=100)println("El precio de la entrada son 5€")
    else println("-1")
}

fun cine2(edad:Int, esLunes:Boolean=false):Int
{
    when(edad)
    {
        in 0..12-> return 3
        in 13..60-> return if (esLunes) 6 else 803
        
        in 60..100-> return 5
        else-> return -1

    }
}