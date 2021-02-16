package kotlinForProfessionals.tasks.chapter19

fun main() {
	generateSequence(1) { value ->
		value + 1
	}.filter { it.isPrime() }.take(100).forEach { println(it) }

}

internal fun Int.isPrime(): Boolean {
	(2 until this).forEach {
		if (this % it == 0) {
			return false
		}
	}
	return true
}

