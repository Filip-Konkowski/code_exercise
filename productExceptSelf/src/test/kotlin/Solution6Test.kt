import org.junit.Test
import kotlin.test.assertEquals

class Solution6Test
{
    @Test
    fun `check length of last word with two words`() =
            assertProductEquals(
                    "Hello World",
                    5,

            )

    @Test
    fun `check length of last word with extra spaces`() =
            assertProductEquals(
                    "   fly me   to   the moon  ",
                    4,
                    )

    private fun assertProductEquals(origin: String, result: Int) = assertEquals(result, Solution6.lengthOfLastWord(origin))
}