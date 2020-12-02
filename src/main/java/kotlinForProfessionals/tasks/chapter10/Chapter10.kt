package kotlinForProfessionals.tasks

@Suppress("UNCHECKED_CAST")
fun main(args: Array<String>) {
    val result = getMenuList(args.toList())
    println(result)
}

fun getMenuList(menuItems: List<String>): String {
    if (menuItems.isNullOrEmpty()) return "Menu is empty"

    var result = "*** Welcome to Taernyl's Folly ***\n\n"
    val menuSize = menuItems.size / 2

    var maxStrLength = 0
    val strLengthArray = mutableListOf<Int>()
    val MIN_DOT_NUMBERS = 3

    for (i in 0 until menuSize) {
        val strLength = menuItems[2 * i].length + menuItems[2 * i + 1].length
        strLengthArray.add(strLength)
        if (strLength > maxStrLength) {
            maxStrLength = strLength
        }
    }

    for (i in 0 until menuSize) {
        val dotsNum = maxStrLength - strLengthArray[i] + MIN_DOT_NUMBERS
        result += "${menuItems[2 * i]}${".".repeat(dotsNum)}${menuItems[2 * i + 1]}\n"
    }

    return result.dropLast(1)
}