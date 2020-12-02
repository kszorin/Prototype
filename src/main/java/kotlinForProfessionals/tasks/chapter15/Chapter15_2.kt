package kotlinForProfessionals.tasks

fun main() {

    println(Direction.NorthEast)
}

data class Coordinate(val x: Int, val y: Int) {

    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}

enum class Direction(val coordinate: Coordinate) {

    North(Coordinate(0, 1)),

    East(Coordinate(1, 0)),

    NorthEast(Coordinate(0, 1) + Coordinate(1, 0));

    override fun toString() = "${this.name} [${coordinate.x}, ${coordinate.y}]"
}

