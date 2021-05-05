package kotlinForProfessionals.tasks.chapter19

import kotlin.system.measureNanoTime

fun main() {
	val bySequance = measureNanoTime {
		printFibBySequance()
	}

	val byCommon = measureNanoTime {
		printFibByCommon()
	}

	println("FibBySequance = $bySequance")
	println("FibByCommon = $byCommon")
}

fun printFibBySequance() {
	generateSequence(Pair(0, 1)) { value ->
		Pair(value.second, value.first + value.second)
	}
		.map { it.second }
		.takeWhile { it > 0 }
		.forEach { println(it) }
}

fun printFibByCommon() {
	var a = 0
	var b = 1
	var result = b
	println(result)
	while (result >= 0) {
		result = a + b
		if (result >= 0) {
			println(result)
		}
		a = b
		b = result
	}
}

