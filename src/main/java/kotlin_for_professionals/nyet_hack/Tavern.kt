package kotlin_for_professionals.nyet_hack

fun main(args: Array<String>) {
    var beverage = readLine()
    if (beverage != null) {
        beverage = beverage.capitalize()
    } else {
        println("I can do it without NPE")
    }

    println(beverage)
}