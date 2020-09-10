package kotlinForProfessionals.tasks

fun main() {

    Coordinator.startCounter()

    val passengerCarType = PassengerCar.type

    val counterHelper = object : CounterHelper {
        override fun plusCounter(a: Int) {
            println("a was increased: ${a + 1}")
        }

        override fun minCounter(a: Int) {
            println("a was decreased: ${a - 1}")
        }
    }

    counterHelper.plusCounter(5)
    counterHelper.minCounter(5)

}

object Coordinator {

    private var counter = 0

    fun startCounter() {
        println("startCounter")
        while (counter < 5) {
            println(counter++)
            Thread.sleep(1000)
        }
    }
}

class PassengerCar {

    companion object {

        init {
            println("init companion object of PassengerCar")
        }

        val type = "Passenger"
    }

}

interface CounterHelper {

    fun plusCounter(a: Int)

    fun minCounter(a: Int)
}