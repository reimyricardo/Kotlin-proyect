
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
import building.pajaroloco
import final.Games
import final2.game2
import practica5.Bobconstruye
import practica5.book5


fun main() {
    while (true) {
        println("\nSeleccione una opción:")

        println("\n--- Práctica 1 ---")
        println("1 - Acuario")
        println("2 - Rainbow")
        println("3 - Nemo List")

        println("\n--- Práctica 2 ---")
        println("4 - Comer Peces")
        println("5 - Nombre de Pez")
        println("6 - Lista")

        println("\n--- Práctica 3 ---")
        println("7 - Galletas")
        println("8 - Agregar Pez")
        println("9 - Emociones")
        println("10 - Emociones 2")
        println("11 - Lambda 1")
        println("12 - Lambda 2")

        println("\n--- Práctica 4 ---")
        println("13 - Spice")
        println("14 - Spice Diferente")
        println("15 - Librería")
        println("16 - Abstract Spice")
        println("17 - Comida 3")

        println("\n--- Práctica 5 ---")
        println("18 - Book 5")
        println("19 - Bob Construye")
        println("20 - Pájaro Loco")

        println("\n--- Última Práctica 6 ---")
        println("21 - Games")
        println("22 - Game 2")

        println("\n0 - Salir")

        print("\nIngrese el número de la opción: ")
        val seleccion = readLine()?.toIntOrNull() ?: -1

        if (seleccion == 0) {
            println("Saliendo del programa...")
            break
        }

        dayOfWeek()

        when (seleccion) {
            // Práctica 1
            1 -> acuario()
            2 -> rainbow()
            3 -> nemolist()

            // Práctica 2
            4 -> comerpeces()
            5 -> Nombrepez()
            6 -> lista()

            // Práctica 3
            7 -> galletas()
            8 -> addFish()
            9 -> Emociones()
            10 -> emociones2()
            11 -> lambda()
            12 -> lambda2()

            // Práctica 4
            13 -> spice()
            14 -> spicediferent()
            15 -> libreria()
            16 -> adstracspice()
            17 -> Comida3()

            // Práctica 5
            18 -> book5()
            19 -> Bobconstruye()
            20 -> pajaroloco()

            // Última Práctica 6
            21 -> Games()
            22 -> game2()

            else -> println("Selección inválida, intenta de nuevo.")
        }
    }
}




fun dayOfWeek() {
    println("What day is it today?")
}