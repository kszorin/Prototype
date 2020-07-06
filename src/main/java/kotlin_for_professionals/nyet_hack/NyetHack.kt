package kotlin_for_professionals.nyet_hack

fun main(args: Array<String>) {
    val name = "Madrigal"

    val healthPoints = 89
    val numFireballs = 500
    val blessed = true

    val immortal = false

    val auraColor = getAuraColor(blessed, healthPoints, immortal)
    val healthStatus =
        getFormatHealthStatus(healthPoints, blessed)
    val druggingStatus = getDruggingStatus(
        castFireball(numFireballs)
    )
    printPlayerStatus(
        auraColor = auraColor,
        blessed = blessed,
        name = name,
        healthStatus = healthStatus,
        druggingStatus = druggingStatus
    )
}

private fun getAuraColor(blessed: Boolean, healthPoints: Int, immortal: Boolean): String =
    if (blessed && healthPoints > 50 || immortal) "GREEN" else "NONE"

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
    healthStatus: String,
    druggingStatus: String
) {
    println("(Aura: $auraColor) (Blessed: ${if (blessed) "YES" else "NO"})")
    println("DruggingStatus $druggingStatus")
    println("($name $healthStatus)")
}

private fun castFireball(numFireballs: Int = 2): Int {
    println("A glass of Fireball springs into existence. (x$numFireballs)")
    return when {
        numFireballs < 1 -> 0
        numFireballs in 1..50 -> numFireballs
        else -> 50
    }
}

private fun getDruggingStatus(druggingLevel: Int) = when (druggingLevel) {
    0 -> "Sober"
    in 1..10 -> "Tipsy"
    in 11..20 -> "Sloshed"
    in 21..30 -> "Soused"
    in 31..40 -> "Stewed"
    else -> "t0aSt3d"
}
