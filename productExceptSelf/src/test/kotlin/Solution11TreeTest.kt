import org.junit.Test
import kotlin.test.assertEquals

// 704. Binary Search
//Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums.
//If target exists, then return its index. Otherwise, return -1.
//
//You must write an algorithm with O(log n) runtime complexity.
class Solution11TreeTest
{
    @Test
    fun `search binary 1`() =
            assertProductEquals(
                intArrayOf(-1,0,3,5,9,12),
                9,
                4,
            )

    @Test
    fun `search binary 2`() =
        assertProductEquals(
                intArrayOf(-1,0,3,5,9,12),
            2,
                -1,

            )

    private fun assertProductEquals(origin: IntArray, target: Int, result: Int) = assertEquals(result, Solution11Tree.search(origin, target))
}