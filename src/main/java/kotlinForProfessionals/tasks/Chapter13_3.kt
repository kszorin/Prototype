package kotlinForProfessionals.tasks

fun main() {
    val sword = Sword("Excalibur")
    println(sword.name) //The legendary Excalibur

    sword.name = "Gleipnir"
    println(sword.name) //The legendary Rinpielg

    val swordWithInit = SwordWithInit("Excalibur")
    println(swordWithInit.name) //The legendary Rubilacxev
}

class Sword(_name: String) {
    var name = _name
        get() = "The legendary $field"
        set(value) {
            field = value.toLowerCase().reversed().capitalize()
        }
}

class SwordWithInit(_name: String) {
    var name = _name
        get() = "The legendary $field"
        set(value) {
            field = value.toLowerCase().reversed().capitalize()
        }

    init {
        name = _name
    }
}