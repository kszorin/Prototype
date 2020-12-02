package kotlinForProfessionals.tasks.chapter18

fun main() {
	println("ssfklsnnnanknfnlkjnakjenljnakanlanlajnalwknawlkanjwlkjnwalkwjnalwnalwkan".numLettersA)
	println(null.numLettersA)

}

val String?.numLettersA
	get() = this?.length ?: 0