package kotlinForProfessionals.tasks.chapter19

fun main() {

	generateSequence(Pair(0, 1)) { value ->
		Pair(value.second, value.first + value.second)
	}
		.map { it.second }
		.takeWhile { it > 0 }
		.forEach { println(it) }
}

