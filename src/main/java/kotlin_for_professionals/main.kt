package kotlin_for_professionals

fun main(args: Array<String>) {
    val name = "Madrigal"

    val healthPoints = 89
    val blessed = true

    val immortal = false

    val auraColor = getAuraColor(blessed, healthPoints, immortal)
    val healthStatus = getFormatHealthStatus(healthPoints, blessed)
    printPlayerStatus(
        auraColor = auraColor,
        blessed = blessed,
        name = name,
        healthStatus = healthStatus
    )
    castFireball()
}

private fun getAuraColor(blessed: Boolean, healthPoints: Int, immortal: Boolean): String {
    val auraVisible = blessed && healthPoints > 50 || immortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    return auraColor
}

private fun getFormatHealthStatus(healthPoints: Int, blessed: Boolean): String =
    when (healthPoints) {
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

private fun printPlayerStatus(
    auraColor: String,
    blessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (blessed) "YES" else "NO"})")
    println("$name $healthStatus")
}

private fun castFireball(numFirebals: Int = 2) {
    println("A glass of Fireball springs into existence. (x$numFirebals)")
}