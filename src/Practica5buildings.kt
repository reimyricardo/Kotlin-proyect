package practica5

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded: Int = 100
    private val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("$actualMaterialsNeeded ${material::class.simpleName} required")
    }
}

fun Bobconstruye() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
}
