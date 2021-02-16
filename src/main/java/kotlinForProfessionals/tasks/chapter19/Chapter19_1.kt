package kotlinForProfessionals.tasks.chapter19

fun main() {
	val animals = listOf("cat", "dog", "horse", "cow", "pig")
	println("Source: $animals")

	val babyTransform: (String) -> String = { animal ->
		when (animal) {
			"cat"   -> "kitty"
			"dog"   -> "pappy"
			"horse" -> "foal"
			"cow"   -> "calf"
			else    -> "baby $animal"
		}
	}
	//Преобразователи
	val babies = animals.map(babyTransform)
	println("After converter map: $babies")

	val familyTransform: (List<String>) -> List<String> = { familyMembers ->
		listOf("${familyMembers.takeLast(3)}")
	}
	println("After converter flatmap: ${listOf(animals, babies).flatMap(familyTransform)}")

	//Фильтры
	val filterThreeCharAnimal: (String) -> Boolean = {
		it.count() == 3
	}
	println("After filtered animals with 3 chars : ${animals.filter(filterThreeCharAnimal)}")

	//Комбинаторы
	val animalsWithBabies = animals.zip(babies)
	println("After combination: ${animalsWithBabies}")
}

