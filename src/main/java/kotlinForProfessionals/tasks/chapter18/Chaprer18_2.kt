package kotlinForProfessionals.tasks.chapter18

fun main() {
	println(frame("Welcome, comrade", 5, "*"))
	println("Welcome, comrade".nameGreeting(5))
}

fun frame(
	title: String,
	padding: Int,
	formatChar: String = "*"
): String {
	val greeting = "$title!"
	val middle = formatChar.padEnd(padding)
		.plus(greeting)
		.plus(formatChar.padStart(padding))
	val end = (0 until middle.length).joinToString("") { formatChar }
	return "$end\n$middle\n$end"
}

fun String.nameGreeting(padding: Int): String {
	val greeting = "$this!"
	val middle = "*".padEnd(padding)
		.plus(greeting)
		.plus("*".padStart(padding))
	val end = (0 until middle.length).joinToString("") { "*" }
	return "$end\n$middle\n$end"
}

