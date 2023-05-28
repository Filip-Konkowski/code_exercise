import org.junit.Test
import org.junit.Ignore
import kotlin.test.assertEquals

class SolutionTest {
    @Test
    fun `check product except`() =

        assertProductEquals(
            intArrayOf(1,2,3,4),
            intArrayOf(24,12,8,6),
    )
}


private fun assertProductEquals(origin: IntArray, nums: IntArray) = assertEquals(nums.toList(), Solution.productExceptSelf(origin).toList())
