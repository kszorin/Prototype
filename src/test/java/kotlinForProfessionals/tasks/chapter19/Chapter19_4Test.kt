package kotlinForProfessionals.tasks.chapter19

import org.junit.Assert
import org.junit.Test

class Chapter19_4Test {

	@Test
	fun `WHEN flipByValues THEN flip array`() {
		val input = mapOf("Josh" to 4.0, "Alex" to 2.0, "Jane" to 3.0)
		val expected = mapOf(4.0 to "Josh", 2.0 to "Alex", 3.0 to "Jane")
		val actual = flipByValues(input)

		Assert.assertEquals(expected, actual)
	}

	@Test
	fun `WHEN processList THEN get correct value`() {
		val values = listOf(1, 18, 73, 3, 44, 6, 1, 33, 2, 22, 5, 7)
		val actual = processList(values)

		Assert.assertEquals(2339, actual)
	}
}