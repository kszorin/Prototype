package kotlinForProfessionals.tasks

import java.io.File

fun main() {
    val transformer = Transformer()

    transformer.name = "Valtron"
    transformer.initTransformer()
}

class Transformer {
    lateinit var name: String

    val fileLength by lazy {
        val f = File("data13.txt")
        f.forEachLine{
            println(it)
        }
        f.length()
    }

    fun initTransformer() {
        val timeStart = System.currentTimeMillis()
        if (::name.isInitialized) {
            println("Transformer was initialized with name = $name")
            println("Uploaded data length = $fileLength")
        } else {
            println("Transformer was not initialized")
        }
        val timeEnd = System.currentTimeMillis()
        println("initTime = ${timeEnd - timeStart}")
    }
}