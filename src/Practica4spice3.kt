package practica4
abstract class A_Spice(val name: String, val spiciness: String = "mild") : SpiceColor {
    abstract fun prepareSpice()
}

interface Grinder {
    fun grind() {
        println("Grinding spice...")
    }
}

interface SpiceColor {
    val color: String
}

object YellowSpiceColor : SpiceColor {
    override val color = "yellow"
}

class Curry(spiciness: String) : A_Spice("Curry", spiciness), Grinder, SpiceColor by YellowSpiceColor {
    override fun prepareSpice() {
        grind()
        println("Curry prepared with spiciness level $spiciness")
    }
}
data class SpiceContainer(val spice: Curry) {
    val label: String
        get() = spice.name
}

fun adstracspice() {
    val curry = Curry("spicy")
    val container = SpiceContainer(curry)
    println("Spice Container Label: ${container.label}")
}
