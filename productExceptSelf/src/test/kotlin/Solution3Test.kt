import org.junit.Test
import kotlin.test.assertEquals

class Solution3Test
{
    @Test
    fun `check simple example`() =
        assertProductEquals(
                intArrayOf(100,4,200,1,3,2),
                4,
        )


    @Test
    fun `check longer case`() =
            assertProductEquals(
                    intArrayOf(0,3,7,2,5,8,4,6,0,1),
                    9,
            )
}


private fun assertProductEquals(origin: IntArray, result: Int) = assertEquals(result, Solution3.longestConsecutive(origin))
