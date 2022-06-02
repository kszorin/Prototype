package coroutines.androidboardcastcourse.lesson1

import java.util.*
import java.util.concurrent.ArrayBlockingQueue
import kotlin.concurrent.thread

fun main() {

    val queue = QueueBuffer(20)

    val producer = thread(
        start = false,
        name = "Producer"
    ) {
        var i = 0
        while (true) {
            val pause = Random().nextInt(3000)
            Thread.sleep(pause.toLong())
            if (!queue.producerPauseFlag) {
                queue.put(i)
                println("Producer put $i")
                i++
            }
        }
    }

    val consumer = thread(
        start = false,
        name = "Consumer"
    ) {
        while (true) {
            val pause = Random().nextInt(7000)
            Thread.sleep(pause.toLong())
            println("Consumer poll ${queue.poll()}")
        }
    }

    producer.start()
    consumer.start()
    println("Main thread")
}

class QueueBuffer(capacity: Int): ArrayBlockingQueue<Int>(capacity) {

    var producerPauseFlag = false

    override fun put(e: Int) {
        super.put(e)
        println("Put $e (capacity ${this.size})")

        if (remainingCapacity() == 0) {
            producerPauseFlag = true
        }
    }

    override fun poll(): Int {
        val e = super.poll() ?: -1
        println("Get $e (capacity ${this.size})")
        return e
    }
}

