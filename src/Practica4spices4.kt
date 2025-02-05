package Spices

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF), YELLOW(0xFFFF00)
}

sealed class Spice(val name: String, val spiciness: String = "mild") : SpiceColor {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind() {
        println("Grinding spice...")
    }
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

class Curry(spiciness: String) : Spice("Curry", spiciness), Grinder, SpiceColor by YellowSpiceColor {
    override fun prepareSpice() {
        grind()
        println("Curry prepared with spiciness level $spiciness")
    }
}

data class SpiceContainer(val spice: Spice) {
    val label: String
        get() = spice.name
}

fun Comida3() {
    val curry = Curry("spicy")
    val container = SpiceContainer(curry)
    println("Spice Container Label: ${container.label}")
    println("Spice Color: ${curry.color}")
}
