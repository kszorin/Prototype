package kotlinForProfessionals.tasks

abstract class Triangle(
    val a: Int,
    val b: Int,
    val angle: Int
)

interface Hypotenusable {

    fun getHypotenuse(): Double
}

class RightTriangle(a: Int, b: Int) :
    Triangle(a, b, 90),
    Hypotenusable {

    override fun getHypotenuse(): Double =
        Math.sqrt((a*a + b*b).toDouble())
}

fun main() {
    val rightTriangle = RightTriangle(3, 4)
    println(rightTriangle.getHypotenuse())
}
