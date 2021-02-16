package kotlinForProfessionals.tasks.chapter19

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class Chapter19_2Test {

	@Test
	fun `WHEN number is 1 THEN return true`(){
		assertTrue(1.isPrime())
	}

	@Test
	fun `WHEN number is 2 THEN return true`(){
		assertTrue(2.isPrime())
	}

	@Test
	fun `WHEN number is 3 THEN return true`(){
		assertTrue(3.isPrime())
	}

	@Test
	fun `WHEN number is prime THEN return true`(){
		assertTrue(5.isPrime())
	}

	@Test
	fun `WHEN number is not prime THEN return false`(){
		assertFalse(6.isPrime())
	}
}