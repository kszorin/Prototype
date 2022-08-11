package coroutines.moskala.understanding

import kotlin.concurrent.thread
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {
    println("${Thread.currentThread().name} before")
    suspendCoroutine<Unit> {cont ->
        continueAfterSecond(cont)
    }
    println("${Thread.currentThread().name} after")
}

private fun continueAfterSecond(continuation: Continuation<Unit>) {
    thread {
        println("${Thread.currentThread().name} before sleep")
        Thread.sleep(2000)
        println("${Thread.currentThread().name} after sleep")
        continuation.resume(Unit)
    }
}