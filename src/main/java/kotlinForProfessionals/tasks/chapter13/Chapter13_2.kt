package kotlinForProfessionals.tasks.chapter13

fun main() {

    val npeGenerator = NPEGenerator()
}

class NPEGenerator {

    var a: IntArray
    val b = initB()

    init {
       a = intArrayOf(5, 5, 6)
    }

    private fun initB() = a[0]
}