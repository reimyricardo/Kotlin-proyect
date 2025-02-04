package practica3

fun galletas(){
    for (i in 1..10) {
        val birthday = getBirthday()
        val fortune = getFortune(birthday)
        println("Your fortune is: $fortune")
        if (fortune == "Take it easy and enjoy life!") {
            break
        }
    }
}

fun getBirthday(): Int {
    print("Enter your birthday: ")

    val birthdayInput = readLine()
    return birthdayInput?.toIntOrNull() ?: 1
}
fun getFortune(birthday: Int): String {

    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    return when {
        birthday == 28 || birthday == 31 -> "Enjoy a wonderful day of success."  // Condiciones especiales
        birthday in 1..7 -> "Things will go well for you today."  // Primer semana del mes
        else -> fortunes[birthday % fortunes.size]  // Si no se cumple ninguna condición especial, calculamos la fortuna
    }
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int,
    hasDecorations: Boolean = true
): Boolean {
    // Calcular el espacio disponible en el tanque
    val availableSpace = if (hasDecorations) {
        tankSize * 0.8 // 80% del tamaño del tanque si tiene decoraciones
    } else {
        tankSize // 100% del tamaño del tanque si no tiene decoraciones
    }

    // Calcular la longitud total de los peces actuales en el tanque
    val currentFishLength = currentFish.sum()

    // Verificar si el nuevo pez cabe en el espacio disponible
    return (currentFishLength + fishSize) <= availableSpace
}

fun addFish() {
    // Pruebas
    println(canAddFish(10.0, listOf(3, 3, 3), 7, true)) // false
    println(canAddFish(8.0, listOf(2, 2, 2), 3, hasDecorations = false)) // true
    println(canAddFish(9.0, listOf(1, 1, 3), 3, true)) // false
    println(canAddFish(10.0, listOf(), 7, true)) // true
}

fun Emociones() {

    println(whatShouldIDoToday("happy", "sunny", 30))  // "Go for a walk"
    println(whatShouldIDoToday("sad"))  // "Stay home and read."
    println(whatShouldIDoToday("happy", "rainy", 18))  // "Watch a movie"
    println(whatShouldIDoToday("neutral", "cloudy", 22))  // "Go for a walk"
}


fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        mood == "happy" && weather == "sunny" -> "Go for a walk"
        mood == "happy" && weather == "rainy" -> "Watch a movie"
        mood == "sad" -> "Stay home and read."
        weather == "cloudy" && temperature in 18..25 -> "Go for a walk"
        temperature > 30 -> "Go swimming"
        else -> "Stay home and relax."
    }
}
