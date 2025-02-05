package practica4

class SimpleSpice {
    val name: String = "curry"
    val spiciness: String = "mild"
    val heat: Int
        get() = 5
}

fun spice() {
    val spice = SimpleSpice()
    println("Spice: ${spice.name}, Heat: ${spice.heat}")
}
