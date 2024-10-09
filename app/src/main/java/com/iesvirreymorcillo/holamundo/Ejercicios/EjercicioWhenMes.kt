package com.iesvirreymorcillo.holamundo.Ejercicios


fun main()
{
    println(mes(12))
}

fun mes(mes:Int):String
{
    when(mes)
    {
        1-> return "Enero";
        2-> return "Febrero";
        3-> return "Marzo";
        4-> return "Abril";
        5-> return "Mayo";
        6-> return "Junio";
        7-> return "Julio";
        8-> return "Agosto";
        9-> return "Septiembre";
        10-> return "Octube";
        11-> return "Noviembre";
        12-> return "Diciembre";
        else-> return "No es un mes válido";
    }
}