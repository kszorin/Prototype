package coroutines.moskala.cancellation

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {
    val job = launch {
        repeat(1_000) { i ->
            delay(100)
            Thread.sleep(800) // simulate long operation
            println("${Thread.currentThread().name}: printing $i")
        }
    }
    delay(1100)
    job.cancel()
    job.join()
    println("${Thread.currentThread().name}: cancelled successfully")
}