package kotlinForProfessionals.tasks.chapter19

fun flipByValues(studentsMap: Map<String, Double>): Map<Double, String> =
	studentsMap
		.also { println(it) }
		.flatMap { listOf(Pair(it.value, it.key)) }.toMap()
		.also { println(it) }

fun processList(values: List<Int>): Int =
	values
		.also { println(it) }
		.filter { it >= 5 }
		.also { println(it) }
		.windowed(2, 2, false) {
			it[0] * it[1]
		}
		.also { println(it) }
		.fold(0) { acc, i -> acc + i }
		.also { println(it) }
