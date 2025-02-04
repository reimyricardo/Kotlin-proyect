
import Practica2.Nombrepez
import practica1.acuario
import practica1.nemolist
import practica1.rainbow
import Practica2.comerpeces
import Practica2.lista
import practica3.*


fun main() {
    val seleccion = 12
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

        else -> println("Selección inválida")
    }
}


fun dayOfWeek() {
    println("What day is it today?")
}