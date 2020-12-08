package kotlinForProfessionals.tasks.chapter18

fun main() {


}

class Car(
	var body: Body,
	var engine: Engine,
	var transmission: Transmission,
	var wheels: Wheels
)

enum class Body {

	SEDAN,
	HATCHBACK,
	WAGON
}

enum class Engine {

	DIESEL,
	PETROL
}

enum class Transmission {

	AUTOMATIC,
	ROBOTIC,
	MANNUAL
}

enum class Wheels {

	STAMPED,
	ALLOY,
	FORGED
}

