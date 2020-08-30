package dagger.engine

import javax.inject.Inject

class Engine @Inject constructor(private val block: Block, private val pump : Pump) {

    init {
        println("\tEngine")
    }
}