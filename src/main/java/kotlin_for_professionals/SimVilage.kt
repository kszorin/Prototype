fun main(arks: Array<String>) {
    runSimulation("Guyal", ::printConstructionCost) { numBuildings: Int, playerName: String ->
        val currentYear = 2020
        println("Adding $numBuildings houses")
        "Welcome to SimVillage, $playerName! (copyright $currentYear)"
    }
}

inline fun runSimulation(playerName: String,
                         costPrinter: (Int) -> Unit,
                         greetingFunction: (Int, String) -> String) {
    val numBuildings = (1..3).random()
    costPrinter(numBuildings)
    println(greetingFunction(numBuildings, playerName))
}

fun printConstructionCost(numBuildings: Int) {
    val cost = 500
    println("construction cost: ${cost * numBuildings}")
}