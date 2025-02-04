package practica3

fun emociones2() {
    println("¿Cómo te sientes hoy? (happy, sad, neutral, etc.)")
    val mood = readLine()!!
    println(whatShouldIDoToday2(mood, "sunny", 30))
    println(whatShouldIDoToday2(mood, "rainy", 0))
    println(whatShouldIDoToday2(mood, "cloudy", 22))
    println(whatShouldIDoToday2(mood, "sunny", 36))
}

fun whatShouldIDoToday2(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24
): String {
    return when {
        isHappyAndSunny(mood, weather) -> "Go for a walk"
        isSadAndRainy(mood, weather, temperature) -> "Stay in bed"
        isNeutralAndCloudy(mood, weather) -> "Go for a walk"
        isSadAndCold(mood, weather, temperature) -> "Stay at home and drink tea"
        isHot(temperature) -> "Go swimming"
        isSadAndHot(mood, temperature) -> "Take a nap"
        else -> "Stay home and relax."
    }
}

fun isHappyAndSunny(mood: String, weather: String) = mood == "happy" && weather == "sunny"

fun isSadAndRainy(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature == 0

fun isNeutralAndCloudy(mood: String, weather: String) = mood == "neutral" && weather == "cloudy"

fun isSadAndCold(mood: String, weather: String, temperature: Int) = mood == "sad" && weather == "rainy" && temperature <= 5

fun isHot(temperature: Int) = temperature > 35

fun isSadAndHot(mood: String, temperature: Int) = mood == "sad" && temperature > 30
