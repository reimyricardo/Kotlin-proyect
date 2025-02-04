package practica3

fun lambda(){
    val rollDice: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    println(rollDice(12))
    println(rollDice(0))  // Imprime 0
   val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    println(rollDice2(6))

}
fun lambda2(){
    val rollDice: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    val rollDice2: (Int) -> Int = { sides ->
        if (sides == 0) 0 else (1..sides).random()
    }
    fun gamePlay(roll: (Int) -> Int) {
        val diceRoll = roll(6)
        println("El resultado del lanzamiento de dado es: $diceRoll")
    }
    gamePlay(rollDice2)
}