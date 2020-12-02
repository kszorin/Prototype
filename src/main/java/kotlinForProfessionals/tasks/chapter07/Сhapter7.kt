package kotlinForProfessionals.tasks

fun main(args: Array<String>) {
    val output = toDragonSpeak("Can I help you?")
    println(output)
}

fun toDragonSpeak(inputString: String): String =
    inputString.replace(regex = Regex("[CaIelou]")) {
        when (it.value) {
            "C" -> "("
            "c" -> "("
            "a" -> "4"
            "I" -> "1"
            "e" -> "3"
            "l" -> "|"
            "o" -> "0"
            "u" -> "|_|"
            else -> it.value
        }
}


