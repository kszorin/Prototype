package dagger

import dagger.di.DaggerCarLineComponent
import javax.inject.Inject

fun main() {

    DaggerCarLineComponent
        .create()
        .inject(CarLine())

}

class CarLine {

    @Inject
    lateinit var car: Car

}