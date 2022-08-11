package coroutines.moskala.understanding

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {
    println("[${Thread.currentThread().name}] main() before")
    val user: String = suspendCoroutine<String> { cont ->
        requestUserApi { cont.resume(it) }
    }
    println("[${Thread.currentThread().name}] User = $user")
    println("[${Thread.currentThread().name}] main() after")
}

private fun requestUserApi(block: (String) -> Unit) {
    println("[${Thread.currentThread().name}] requestUser() before")
    Thread.sleep(2000)
    val user = "Vasya Pupkin"
    block(user)
    println("[${Thread.currentThread().name}] requestUser() after")
}