import org.junit.Test
import kotlin.test.assertEquals

// 704. Binary Search
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
//If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
class Solution12Test
{
    @Test
    fun `check string is Parentheses`() =
        assertProductEquals(
            "()",
            true,

            )

    @Test
    fun `check string not Parentheses`() =
        assertProductEquals(
            "(]",
            false,
        )

    private fun assertProductEquals(origin: String, result: Boolean) = assertEquals(result, Solution12.isValid(origin))
}