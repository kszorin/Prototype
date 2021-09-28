package dagger

import javax.inject.Inject

fun main() {

//    DaggerCarLineComponent
//        .create()
//        .inject(CarLine())

}

class CarLine {

    @Inject
    lateinit var car: Car

}