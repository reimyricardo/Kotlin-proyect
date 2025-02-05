package building
open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)
class Brick : BaseBuildingMaterial(8)

class Building<T : BaseBuildingMaterial>(private val material: T) {
    private val baseMaterialsNeeded = 100
    val actualMaterialsNeeded: Int
        get() = baseMaterialsNeeded * material.numberNeeded

    fun build() {
        println("${actualMaterialsNeeded} ${material::class.simpleName} required")
    }
}
fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("Small building")
    } else {
        println("Large building")
    }
}
fun pajaroloco() {
    val woodBuilding = Building(Wood())
    woodBuilding.build()
    isSmallBuilding(woodBuilding)

    val brickBuilding = Building(Brick())
    brickBuilding.build()
    isSmallBuilding(brickBuilding)  }
