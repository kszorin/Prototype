package kotlinForProfessionals.tasks.chapter19

fun flipByValues(studentsMap: Map<String, Double>): Map<Double, String> =
	studentsMap
		.also { println(it) }
		.flatMap { listOf(Pair(it.value, it.key)) }.toMap()
		.also { println(it) }
