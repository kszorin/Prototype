package coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        doWorld()
    }
    println("Hello (${Thread.currentThread()})")
}

suspend fun doWorld() {
    withContext(Dispatchers.Default) {
        delay(3000L)
        println("World! (${Thread.currentThread()})")
    }
}