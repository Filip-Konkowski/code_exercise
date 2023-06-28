import org.junit.Test
import kotlin.test.assertEquals

class Solution8Test
{
    @Test
    fun `find majority element`() =
            assertProductEquals(
                intArrayOf(3,2,3),
                3,
            )

    fun `find majority element two`() =
        assertProductEquals(
                intArrayOf(2,2,1,1,1,2,2),
                2,
            )

    private fun assertProductEquals(origin: IntArray, result: Int) = assertEquals(result, Solution8.majorityElement(origin))
}