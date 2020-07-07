package kotlin_for_professionals.nyet_hack

fun main(args: Array<String>) {
    val beverage = readLine()?.let {
        if (it.isNotBlank()) {
            it.capitalize()
        } else {
            "Buttered Ale"
        }
    }
    println(beverage)
}