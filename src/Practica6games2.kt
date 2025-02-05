package final2
import kotlin.math.absoluteValue

enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Location(private val width: Int = 4, private val height: Int = 4) {
    private val map = Array(width) { arrayOfNulls<String>(height) }
    var x = 0
    var y = 0

    init {
        for (i in 0 until width) {
            for (j in 0 until height) {
                map[i][j] = "Location ($i, $j)"
            }
        }
    }

    fun updateLocation(dx: Int, dy: Int) {
        val newX = (x + dx).coerceIn(0, width - 1)
        val newY = (y + dy).coerceIn(0, height - 1)
        x = newX
        y = newY
        println("You are now at: ${map[x][y]}")
    }
}

class Game {
    var path = mutableListOf(Directions.START)
    private val location = Location()

    val north: () -> Unit = { path.add(Directions.NORTH); location.updateLocation(-1, 0) }
    val south: () -> Unit = { path.add(Directions.SOUTH); location.updateLocation(1, 0) }
    val east: () -> Unit = { path.add(Directions.EAST); location.updateLocation(0, 1) }
    val west: () -> Unit = { path.add(Directions.WEST); location.updateLocation(0, -1) }

    val end: () -> Unit = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
    }

    fun move(where: () -> Unit) {
        where()
    }

    fun makeMove(direction: String?) {
        when (direction) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }
}

fun game2() {
    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        val input = readLine()?.lowercase()
        game.makeMove(input)
    }
}
