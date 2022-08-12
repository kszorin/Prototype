package coroutines.moskala.understanding

import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

suspend fun main() {
    println("[${Thread.currentThread().name}] main() before")
    try {
        val user: String = requestUser()
        println("[${Thread.currentThread().name}] User = $user")
    } catch (ex: java.lang.Exception) {
        println(ex)
    }

    println("[${Thread.currentThread().name}] main() after")
}

private suspend fun requestUser(): String =
    suspendCoroutine { cont ->
        try {
            requestUserApi(
                onSuccess = cont::resume,
                onError = cont::resumeWithException
            )
        } catch (ex: Exception) {
            cont.resumeWithException(ex)
        }
    }

private fun requestUserApi(
    onSuccess: (String) -> Unit,
    onError: (Exception) -> Unit,
) {
    println("[${Thread.currentThread().name}] requestUser() before")
    Thread.sleep(2000)
//    val user: String? = "Vasya Pupkin"
    val user: String? = null
    user?.let { onSuccess(user) } ?: onError(Exception("Can't get user!"))
    println("[${Thread.currentThread().name}] requestUser() after")
}