import org.junit.Test
import kotlin.test.assertEquals

class Solution5Test
{
    @Test
    fun `check single number`() =
            assertProductEquals(
                    intArrayOf(4, 4, 8, 8, 1),
                    1,

            )

    @Test
    fun `check single number two`() =
            assertProductEquals(
                    intArrayOf(2),
                    2,
                    )

    private fun assertProductEquals(origin: IntArray, result: Int) = assertEquals(result, Solution5.singleNumber(origin))
}