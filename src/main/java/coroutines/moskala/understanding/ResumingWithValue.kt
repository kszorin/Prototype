package coroutines.moskala.understanding

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {
    println("[${Thread.currentThread().name}] main() before")
    val user: String = requestUser()
    println("[${Thread.currentThread().name}] User = $user")
    println("[${Thread.currentThread().name}] main() after")
}

private suspend fun requestUser(): String =
    suspendCoroutine { cont ->
        requestUserApi { cont.resume(it) }
    }

private fun requestUserApi(block: (String) -> Unit) {
    println("[${Thread.currentThread().name}] requestUser() before")
    Thread.sleep(2000)
    val user = "Vasya Pupkin"
    block(user)
    println("[${Thread.currentThread().name}] requestUser() after")
}