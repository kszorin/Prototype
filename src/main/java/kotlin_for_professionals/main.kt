package kotlin_for_professionals

fun main(args: Array<String>) {
    val name = "Madrigal"

    val healthPoints = 100
    val blessed = true

    val immortal = false

    val auraVisible = blessed && healthPoints > 50 || immortal

    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0) * 20).toInt()
    var auraColor = when (karma) {
        in 0..5 -> "red"
        in 6..10 -> "orange"
        in 11..15 -> "purple"
        in 16..20 -> "green"
        else -> "none"
    }

    auraColor = if (auraVisible) auraColor else "none"

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

    val statusFormatString = "(HP: $healthPoints) (Aura: $auraColor) -> $name $healthStatus"

    println(statusFormatString)

}