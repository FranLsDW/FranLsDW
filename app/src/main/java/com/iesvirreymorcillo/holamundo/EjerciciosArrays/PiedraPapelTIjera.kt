package com.iesvirreymorcillo.holamundo.EjerciciosArrays

import kotlin.random.Random

fun main(){
    val opciones= arrayOf("Piedra","Papel","Tijera","Lagarto","Spook")
    imprimeResultado(getOptMaquina(opciones), getOptJugador(opciones))
}

fun getOptJugador(opciones:Array<String>):String{
    println("Introduzca una opcion:")
    opciones.forEachIndexed(){index,value ->
        println("${index+1}->$value")
    }

    while(true) {
        var option:Int= readLine()!!.toInt()

        if(option>=1 && option<=5){
            option--
            return opciones[option]
        }else
            println("No ha seleccionado una opción válida")
    }
}

fun getOptMaquina(opciones:Array<String>):String{
    return opciones[Random.nextInt(1,opciones.size)]
}

fun  imprimeResultado(opcMaquina:String, opcJugador:String){

    println("Has seleccionado: $opcJugador");
    println("Juegas contra: $opcMaquina");
    //Si son distintas
    if(opcJugador!=opcMaquina){
        when(opcJugador){
            "Piedra"-> when(opcMaquina){
                            "Papel"-> println("Has perdido")
                            "Tijera"-> println("Has ganado")
                            "Lagarto"-> println("Has ganado")
                            "Spook"-> println("Has perdido")
                        }
            "Papel"-> when(opcMaquina){
                            "Piedra"-> println("Has ganado")
                            "Tijera"-> println("Has perdido")
                            "Lagarto"-> println("Has perdido")
                            "Spook"-> println("Has ganado")
                        }
            "Tijera"-> when(opcMaquina){
                            "Piedra"-> println("Has perdido")
                            "Papel"-> println("Has ganado")
                            "Lagarto"-> println("Has ganado")
                            "Spook"-> println("Has perdido")
                        }
            "Lagarto"-> when(opcMaquina){
                            "Piedra"-> println("Has perdido")
                            "Papel"-> println("Has ganado")
                            "Tijera"-> println("Has ganado")
                            "Spook"-> println("Has perdido")
                        }
            "Spook"-> when(opcMaquina){
                            "Piedra"-> println("Has ganado")
                            "Papel"-> println("Has perdido")
                            "Tijera"-> println("Has ganado")
                            "Lagarto"-> println("Has perdido")
                        }
        }
    }else{
        println("Empate");
    }
}