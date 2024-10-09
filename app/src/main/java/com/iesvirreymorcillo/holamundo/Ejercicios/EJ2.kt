package com.iesvirreymorcillo.holamundo.Ejercicios

import com.iesvirreymorcillo.holamundo.scan

fun main(){
    //EJ2: Calcular la energia cinetica
    println("Introduzca La masa:");
    val masa = scan.nextLine().trim().toInt();
    println("Introduzca La velocidad:");
    val velocidad = scan.nextLine().trim().toInt();

    //EC=1/2*m*v^2
    println("La energia cinetica equivale a es:"+(masa*(velocidad*velocidad))/2);
}
/*
* Define los tipos de las siguientes Variables
    a. 1495970192837664L-----------------------Long
    b. 12.5------------------------------------Long
    c. true------------------------------------Boolean
    d. 90--------------------------------------Int
    e. &quot;Pim, pam, toma Lacasitos&quot;----String
    f. 6.626070040-----------------------------Long
    g. 8.8f------------------------------------Float
*/