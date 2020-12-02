package kotlinForProfessionals.tasks.chapter11

import kotlinForProfessionals.tasks.removeBeggarUsers
import org.junit.Assert.assertEquals
import org.junit.Test

class Chapter11Test {

    @Test
    fun `WHEN user without money EXPECT remove him from map`(){
        val startMap = mutableMapOf("aaaa" to 12, "bbbb" to 13, "ccc" to 0, "ddd" to 5)
        val expected = mutableMapOf("aaaa" to 12, "bbbb" to 13, "ddd" to 5)

        val actual = removeBeggarUsers(startMap)
        assertEquals(expected, actual)
    }
}