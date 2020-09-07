package dagger.transmission

import javax.inject.Inject

class ManualGear @Inject constructor(private val arm: Arm) : Shiftable {

    init {
        println("\tManualGear")
    }

    override fun shift() {
        println("<<Shifting by manual gear>>")
    }
}