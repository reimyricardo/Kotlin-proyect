
import Practica2.Nombrepez
import practica1.acuario
import practica1.nemolist
import practica1.rainbow
import Practica2.comerpeces
import Practica2.lista
import practica3.*
import practica4.adstracspice
import practica4.libreria
import practica4.spice
import practica4.spicediferent
import  Spices.Comida3
import practica5.Book5

fun main() {
    val seleccion = 18
    dayOfWeek()
    when (seleccion) {
        1 -> acuario()
        2 -> rainbow()
        3 -> nemolist()
        //Pratica 2
        4 -> comerpeces()
        5 -> Nombrepez()
        6 -> lista()
        // Practica 3
        7 -> galletas()
        8 -> addFish()
        9 -> Emociones()
        10 -> emociones2()
        11 -> lambda()
        12-> lambda2()
        //practica 4
        13 -> spice()
        14 -> spicediferent()
        15 -> libreria()
        16 -> adstracspice()
        17 -> Comida3()
        18 -> Book5()


        else -> println("Selección inválida")
    }
}


fun dayOfWeek() {
    println("What day is it today?")
}