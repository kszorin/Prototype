package kotlinForProfessionals.tasks.chapter22

import org.junit.Assert.assertEquals
import org.junit.Test

class Chapter22Test {

	@Test
	fun `WHEN getCharacterFromApi THEN get character entity from api data`() {
		val apiData = "elf,Fenella Bowie,8,13,9"
		val expected = Character(
			name = "Fenella Bowie",
			race = "elf",
			dex = "8",
			wis = "13",
			str = "9"
		)
		val actual = fromApiData(apiData)
		assertEquals(expected, actual)
	}
}