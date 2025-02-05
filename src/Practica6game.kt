package final
enum class Directions {
    NORTH, SOUTH, EAST, WEST, START, END
}

class Game {
    var path = mutableListOf(Directions.START)

    val north: () -> Unit = { path.add(Directions.NORTH) }
    val south: () -> Unit = { path.add(Directions.SOUTH) }
    val east: () -> Unit = { path.add(Directions.EAST) }
    val west: () -> Unit = { path.add(Directions.WEST) }

    val end: () -> Boolean = {
        path.add(Directions.END)
        println("Game Over: $path")
        path.clear()
        false
    }
}

fun Games() {
    val game = Game()
    println(game.path)
    game.north()
    game.east()
    game.south()
    game.west()
    game.end()
    println(game.path)

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(numbers.filterDivisibleBy { it % 3 })
}

fun List<Int>.filterDivisibleBy(predicate: (Int) -> Int): List<Int> {
    return this.filter { predicate(it) == 0 }
}

