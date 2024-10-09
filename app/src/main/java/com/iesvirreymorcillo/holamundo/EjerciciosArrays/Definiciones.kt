package com.iesvirreymorcillo.holamundo.EjerciciosArrays

fun  main(){
    //1. Crea un array del 1 al 10. Usa emptyArray.
    var Array1=emptyArray<Int>();
    println("1.1->"+Array1.joinToString());
    for (i in 1..10){
        Array1+=i
    }
    println("1.2->"+Array1.joinToString());
    //2. Crea un array del 1 al 10. Usa IntArray.
    var Array2 = IntArray(10){i->i+1};
    println("2->"+Array2.joinToString());
    //3. Crea un array del 1 al 10. Usa arrayOf.
    var Array3 = arrayOf(1,2,3,4,5,6,7,8,9,10);
    println("3->"+Array3.joinToString());
    //4. Crea un array del 1 al 5 y suma sus valores.
    var suma:Int=0;
    var Array4 = arrayOf(1,2,3,4,5);
    for (i in 0..Array4.size-1)
        suma+=Array4[i];
    println("4->$suma");
    println("4->"+Array4.sum());
    //5. Crea un array del 1 al 5 y obten la media.
    var media:Int=0;
    var Array5: Array<Int> = arrayOf(1,2,3,4,5);
    for (i in 0..Array5.size-1)
        media+=Array5[i];
    media /= Array5.size;
    println("5->$media");
    println("5->"+Array5.average());
    //6. Crea un array e indica cual es el máximo y el mínimo
    var Array6: Array<Int> = arrayOf(4,4,8,6,8,9,3,28,5,7,1);
    println("6:max->${Array6.max()}");
    println("6:min->${Array6.min()}");
    //7. Crea dos arrays y compara si son iguales.
    println(if(Array4.contentEquals(Array5))"7->Son iguales" else "7->No son iguales");
    println(if(Array4.contentEquals(Array6))"7->Son iguales" else "7->No son iguales");
    //8. Crea un array del 1 al 5 y desordénalos.
    var Array8: Array<Int> = arrayOf(1,2,3,4,5);
    Array8.shuffle();
    println("8->"+Array8.joinToString());
    //9. Crea un array con valores desordenados y ordénalos.
    Array8.sort();
    println("9->"+Array8.joinToString());
    //10. Crea un array con los planetas del sistema solar y muestre por pantalla el nombre del planeta y su posicion
    var sistemaSolar= arrayOf("Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano" , "Neptuno");
    for (i in 0..sistemaSolar.size-1)
        println("El planeta en la posicion ${i+1} es:"+sistemaSolar[i])
    //11. Crea tres arrays de palabras “guays”, debemos elegir una palabra aleatoriamente de cada array y ponerlas juntas para animar la clase
    var guay1= arrayOf("Vamos ","A tope ", "Venga ");
    var guay2= arrayOf("clase ","cabrones ","equipo ");
    var guay3= arrayOf("de guays","de vagos","de estudiantes");
        var animo=guay1.get((Math.random()*guay1.size).toInt());
        animo+=guay2.get((Math.random()*guay2.size).toInt());
        animo+=guay3.get((Math.random()*guay3.size).toInt());
    println(animo)
}