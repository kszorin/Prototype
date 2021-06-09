package kotlinForProfessionals.tasks.chapter22

import java.io.Serializable
import java.net.URL

fun main() {
	println(fetchCharacterData())
}

val CHARACTER_DATA_API = "https://chargen-api.herokuapp.com/"

fun fetchCharacterData(): Character {
	val apiData =URL(CHARACTER_DATA_API).readText()
	return fromApiData(apiData)
}

fun fromApiData(apiData: String): Character {
	val (race, name, dex, wis, str) = apiData.split(",")
	return Character(
		name = name,
		race = race,
		dex = dex,
		wis = wis,
		str = str
	)
}

data class Character(
	val name: String,
	val race: String,
	val dex: String,
	val wis: String,
	val str: String
): Serializable