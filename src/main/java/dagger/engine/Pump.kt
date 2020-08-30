package dagger.engine

import javax.inject.Inject

class Pump @Inject constructor() {

    init {
        println("\t\tPump")
    }
}