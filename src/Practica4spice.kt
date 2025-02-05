package practica4
class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() = when (spiciness) {
            "mild" -> 5
            "medium" -> 7
            "spicy" -> 10
            "very spicy" -> 15
            else -> 0
        }

    init {
        println("Spice: $name, Spiciness: $spiciness, Heat: $heat")
    }
}

fun makeSalt() = Spice("Salt", "not spicy")

fun spicediferent() {
    val spices = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "spicy"),
        Spice("cinnamon", "medium"),
        Spice("chili", "very spicy"),
        makeSalt()
    )

    val filteredSpices = spices.filter { it.heat <= 7 }

    filteredSpices.forEach { println("Filtered Spice: ${it.name}, Heat: ${it.heat}") }
}
