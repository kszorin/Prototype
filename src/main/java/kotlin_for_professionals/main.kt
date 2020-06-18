package kotlin_for_professionals

fun main(args: Array<String>) {
    val name = "Madrigal"

    val healthPoints = 89
    val blessed = true

    val immortal = false

    val auraVisible = blessed && healthPoints > 50 || immortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println("(Aura: $auraColor) (Blessed: ${if (blessed) "YES" else "NO"})")

    val healthStatus = when (healthPoints) {
        100 -> "is excelent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (blessed) {
            "has some minor wounds, but is healing quite quickly!"
        } else {
            "has some minor wounds."
        }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    println("$name $healthStatus")

}