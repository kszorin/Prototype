package kotlinForProfessionals.tasks

import org.junit.Assert.assertEquals
import org.junit.Test


class Chapter10Test {

    @Test
    fun `WHEN get menu is empty EXPECT print empty menu`() {
        val expected = "Menu is empty"
        val actual = getMenuList(listOf())
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get menu with even items EXPECT print them all in two columms`() {
        val menuItems = listOf("aaa", "23.24", "fsfwfwf", "245")
        val expected = "*** Welcome to Taernyl's Folly ***\n" +
                "\n" +
                "aaa.....23.24\n" +
                "fsfwfwf...245"
        val actual = getMenuList(menuItems)
        assertEquals(expected, actual)
    }

    @Test
    fun `WHEN get menu with odd items EXPECT print them without last in two columms`() {
        val menuItems = listOf("aaa", "23.24", "fsfwfwf", "245", "lkmlkml")
        val expected = "*** Welcome to Taernyl's Folly ***\n" +
                "\n" +
                "aaa.....23.24\n" +
                "fsfwfwf...245"
        val actual = getMenuList(menuItems)
        assertEquals(expected, actual)
    }


}