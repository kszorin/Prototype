package coroutines.moskala.understanding

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private val executor = Executors.newSingleThreadScheduledExecutor { runnable ->
    Thread(runnable, "scheduler").apply { isDaemon = true }
}

suspend fun main() {
    println("${Thread.currentThread().name} before")
    customDelay(2000)
    println("${Thread.currentThread().name} after")
}

suspend fun customDelay(millis: Long) {
    suspendCoroutine<Unit> { cont ->
        executor.schedule(
            { cont.resume(Unit) },
            millis,
            TimeUnit.MILLISECONDS
        )
    }
}