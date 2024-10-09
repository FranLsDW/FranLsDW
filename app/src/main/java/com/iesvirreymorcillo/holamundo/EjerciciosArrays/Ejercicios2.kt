package com.iesvirreymorcillo.holamundo.EjerciciosArrays

fun main()
{
    ej13();
}

fun ej12(){
    //Corregir errores
    println("HOBITS:");
    val hobbits= arrayOf("Frodo","Sam","Merry","Pippin");
    for (x in 0..hobbits.size-1)
        println("${hobbits[x]} is a good hobbit.");

    //Parte 2
    println("BOMBEROS:");
    val  firemen= arrayOf("Pugh","Pugh","Barney McGrew", "Curthbert","Dibble","Grub");
    for (x in 0..firemen.size-1)
        println("Fireman number ${x+1} if ${firemen[x]}.");
}

fun ej13(){
    //Ordena las siguientes etiquetas para que el código muestre por pantalla lo siguiente
    val fruit= arrayOf("Apple","Banana", "Cherry","Blueberry","Pomegranate");
    val index = arrayOf(1,3,4,2);
    var x=0;
    var y:Int;

    while (x<4){
        y=index[x];
        println("Fruit = ${fruit[y]}")
        x=x+1;
    }
}