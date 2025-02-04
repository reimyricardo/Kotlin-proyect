
import Practica2.Nombrepez
import practica1.acuario
import practica1.nemolist
import practica1.rainbow
import Practica2.comerpeces
import Practica2.lista

fun main() {
    val seleccion = 5
    dayOfWeek()
    when (seleccion) {
        1 -> acuario()
        2 -> rainbow()
        3 -> nemolist()
        4 -> comerpeces()
        5 -> Nombrepez()
        6 -> lista()
        else -> println("Selección inválida")
    }
}


fun dayOfWeek() {
    println("What day is it today?")
}