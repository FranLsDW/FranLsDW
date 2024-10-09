package com.iesvirreymorcillo.holamundo.EjerciciosArrays

fun main(args: Array<String>){
    imprimirSuma(1,2,3,4);
    imprimirSuma(8,12,8,79,5);
    imprimirSuma(150,800,450,400,750,1000,250);
}

fun imprimirSuma(vararg numeros:Int):Int{
    var total=0
    for(elemento in numeros)
        total+=elemento
    println("El total es: $total")
        return total
}