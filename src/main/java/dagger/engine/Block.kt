package dagger.engine

import javax.inject.Inject

class Block @Inject constructor(cylinders: Int) {

    init {
        println("\t\tBlock with $cylinders")
    }
}