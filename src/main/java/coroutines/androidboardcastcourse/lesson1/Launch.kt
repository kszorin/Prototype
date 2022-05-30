package coroutines.androidboardcastcourse.lesson1

import kotlinx.coroutines.*
import java.util.*

fun main(): Unit = runBlocking {
    //с асинхронностью
    repeat(20) {
        launch {
            val result = doWork("Attempt $it")
            println(result)
        }
    }

    //Без асинхронности
    repeat(20) {
        val result = doWork("Attempt $it")
        println(result)
    }

    //async/await
    val coroutines: List<Deferred<String>> = List(20) {
        async {
            doWork(it.toString())
        }
    }
    coroutines.forEach { println(it.await()) }
}

suspend fun doWork(str: String): String {
    delay(Random().nextInt(2000).toLong())
    return "$str, done!"
}
