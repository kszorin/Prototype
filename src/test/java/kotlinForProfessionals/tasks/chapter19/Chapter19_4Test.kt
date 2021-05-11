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
}