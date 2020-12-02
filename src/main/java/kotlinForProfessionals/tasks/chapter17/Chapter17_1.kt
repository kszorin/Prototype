package kotlinForProfessionals.tasks

fun main() {
    val freezer = Freezer<Milk>()

    freezer.put(Milk())
    val price = freezer.getPrice {
        when (it.fatness) {
            3.5F -> 50
            4.8F -> 67
            else -> null
        }
    }

    println("Fatness of Milk = ${freezer.take()?.fatness}")
    println("Price of Milk = $price")
}

class Freezer<T : Drink> {

    var item: T? = null

    fun put(item: T) {
        this.item = item
    }

    fun <R> getPrice(converter: (T) -> R): R? =
        item?.let { converter(it) }

    fun take() = item
}

open class Drink(val name: String)
class Milk(val fatness: Float = 3.5F) : Drink("Milk")
class Beer(val degr: Int = 10) : Drink("Beer")