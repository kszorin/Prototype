package coroutines.moskala.builders

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val res1 = GlobalScope.async {
        delay(1000)
        println("produced Text 1")
        "Text 1"
    }

    val res2 = GlobalScope.async {
        delay(3000)
        println("produced Text 2")
        "Text 2"
    }

    val res3 = GlobalScope.async {
        delay(2000)
        println("produced Text 3")
        "Text 3"
    }
    println(res1.await())
    println(res2.await())
    println(res3.await())
    println("The End")
}