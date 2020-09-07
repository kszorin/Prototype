package dagger.transmission

import javax.inject.Inject

class Arm @Inject constructor() {
    init {
        println("\t\tArm")
    }
}