package kotlinForProfessionals.tasks

fun main() {

    val odometr = Odometr(100)

    println("speed = ${odometr.speed}")
    for (i in 0..60) {
        with(odometr) {
            time = i.toFloat()
            println("time: ${"%02d".format(i)} sec, distance: ${"%.2f".format(distance)} km")
            Thread.sleep(300)
        }
    }

}

class Odometr(val speed: Int) {

    var time: Float = 0.toFloat()
        set(value) {
            field = value / 3600
        }

    val distance: Float
        get() = speed * time
}