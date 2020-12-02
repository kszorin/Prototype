package kotlinForProfessionals.tasks

open class Pet
class Dog : Pet() {
	override fun toString(): String {
		return "Dog"
	}
}

class Fish : Pet() {
	override fun toString(): String {
		return "Fish"
	}
}


/*class Shelter<T>(val inhabitant: T)

fun main() {

	var petShelter = Shelter<Pet>(Fish())
	val dogShelter = Shelter<Dog>(Dog())

//	error!
	petShelter = dogShelter

}*/

/*class Shelter<out T>(val inhabitant: T)

fun main() {

	var petShelter = Shelter<Pet>(Fish())
	val dogShelter = Shelter<Dog>(Dog())

	petShelter = dogShelter
	//параметр в роли производителя (ковариантность), т.е. доступен для чтения, но не для записи
	println("Shelter: ${petShelter.inhabitant}")

}*/

class Shelter<in T>(inhabitant: T)

fun main() {

	var petShelter = Shelter<Pet>(Fish())
	var dogShelter = Shelter<Dog>(Dog())

	/*
	//ошибка!
	petShelter = dogShelter
	 */

	//разрешено, потому параметр в роли потребителя (контрвариантность), т.е. доступен для записи
	dogShelter = petShelter
	/*

	//ошибка!
	println("Shelter: ${petShelter.inhabitant}")
	*/
}

/*
class Shelter<T>(val inhabitant: T)

fun main() {

	var petShelter = Shelter<Pet>(Fish())
	val dogShelter = Shelter<Dog>(Dog())

//	error!
	petShelter = dogShelter

}*/

