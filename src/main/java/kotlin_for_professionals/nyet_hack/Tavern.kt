package kotlin_for_professionals.nyet_hack

fun main(args: Array<String>) {
    var beverage = readLine()
//    beverage = null
    beverage?.let {
        beverage = it.capitalize()
    } ?: println("I can do it without NPE")
    println(beverage)
}