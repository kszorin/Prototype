package dagger.transmission

import javax.inject.Inject

class AutomaticGear @Inject constructor(private val torqueConverter: TorqueConverter) : Shiftable {

    init {
        println("\tAutomaticGear")
    }

    override fun shift() {
        println("<<Shifting by automatic gear>>")
    }
}