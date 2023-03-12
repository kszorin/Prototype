package coroutines.moskala.cancellation

import kotlinx.coroutines.Job
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main(): Unit = coroutineScope {
    val job = Job()
    launch(job) {
        repeat(1_000) { i ->
            delay(100)
            Thread.sleep(500) // simulate long operation
            println("${Thread.currentThread().name}: printing 0-$i")
        }
    }
    launch(job) {
        repeat(1_000) { i ->
            delay(100)
            Thread.sleep(300) // simulate long operation
            println("${Thread.currentThread().name}: printing 1-$i")
        }
    }
    delay(1100)
    job.cancel()
    job.join()
    println("${Thread.currentThread().name}: cancelled successfully")
}