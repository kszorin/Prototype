package dagger

import dagger.engine.Engine
import dagger.transmission.Shiftable
import javax.inject.Inject


class Car @Inject constructor(private val engine: Engine, private val shiftable: Shiftable) {

    init {
        println("Car")
    }


}