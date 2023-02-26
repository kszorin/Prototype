package coroutines.moskala.builders

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

suspend fun main() = runBlocking {
    /*GlobalScope.*/launch {
        delay(1000L)
        println("World!")
    }
    /*GlobalScope.*/launch {
        delay(2000L)
        println("World!")
    }
    println("Hello,")
//    delay(3000L)
}