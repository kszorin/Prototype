package coroutines.moskala.builders

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {
    launch {
        delay(1000L)
        println("${Thread.currentThread().name}: World!")
    }

    println("${Thread.currentThread().name}: Hello,")
}