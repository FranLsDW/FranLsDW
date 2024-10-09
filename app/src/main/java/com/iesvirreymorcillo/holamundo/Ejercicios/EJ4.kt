package com.iesvirreymorcillo.holamundo.Ejercicios

import android.icu.text.DecimalFormat
import kotlin.math.roundToInt


fun main(){
    /*Calcula el gasto promedio  para 180 clicks
    Donde los clicks tienen precio dependiendo del numero de los mismos
    Debemos calcular su iVA*/
    val Nclicks=180;
    var precio:Double=0.0;

    for(i in 1..Nclicks){
        if(i<=20) precio+=0.8
        else if (i<=60) precio+=0.6
        else precio+=0.25
    }

    precio=Math.floor(precio);
    println("El precio total es: $precio€ \nY el precio con iba es:"+ (precio*1.21))
}