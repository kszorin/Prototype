package kotlin_for_professionals.tasks

import org.junit.Assert.assertEquals
import org.junit.Test

class Chapter7Test {
    @Test
    fun `WHEN condition EXPECT result`() {
        val expected = "(4n 1 h3|p y0|_|?"
        val actual = toDragonSpeak("Can I help you?")

        assertEquals(expected, actual)
    }
}