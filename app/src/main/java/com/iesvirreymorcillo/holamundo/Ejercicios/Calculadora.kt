package com.iesvirreymorcillo.holamundo.Ejercicios

fun main()
{
    /*Pedir operacion*/
    println("Introduce la operacion:");
    println("1-Suma");
    println("2-Resta");
    println("3-Multiplicacion");
    println("4.-Division");
    var operacion= readln().toInt();

    var n1:Double?;
    var n2:Double?;
    do{
        /*Pedir dos numeros*/
        println("Introduce el primer numero:");
        n1= readln().toDoubleOrNull();
        println("Introduce el segundo numero:");
        n2= readln().toDoubleOrNull();
    }while (n1==null || n2==null)


    /*Mostrar resultado*/
    when(operacion){
        1-> suma(n1!!,n2!!);
        2-> resta(n1!!,n2!!);
        3-> multiplicacion(n1!!,n2!!);
        4-> division(n1!!,n2!!);
    }
}

fun suma(n1:Double,n2:Double){
    println("$n1 + $n2 = "+(n1+n2))
}
fun resta(n1:Double,n2:Double){
    println("$n1 - $n2 = "+(n1-n2))
}
fun multiplicacion(n1:Double,n2:Double){
    println("$n1 * $n2 ="+(n1*n2))
}
fun division(n1:Double,n2:Double){
    println("$n1 / $n2 ="+(n1/n2))
}
