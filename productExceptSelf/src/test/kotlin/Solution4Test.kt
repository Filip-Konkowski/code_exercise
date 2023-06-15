import org.junit.Test
import kotlin.test.assertEquals

class Solution4Test
{
    @Test
    fun `check simple example add 3`() =
            assertProductEquals(
                    intArrayOf(4, 5, 8, 2),
                    4,
                    3

            )
    @Test
    fun `check simple example add 5`() =
            assertProductEquals(
                    intArrayOf(4, 5, 8, 2, 3),
                    5,
                    5
            )

    @Test
    fun `check simple example add 10`() =
            assertProductEquals(
                    intArrayOf(4, 5, 8, 2, 3, 5),
                    5,
                    10
            )

    @Test
    fun `check simple example add 9`() =
            assertProductEquals(
                    intArrayOf(4, 5, 8, 2, 3, 5, 19),
                    8,
                    9
            )

}

//Input
//["KthLargest", "add", "add", "add", "add", "add"]
//[[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]
//Output
//[null, 4, 5, 5, 8, 8]
//
//Explanation
//KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
//kthLargest.add(3);   // return 4
//kthLargest.add(5);   // return 5
//kthLargest.add(10);  // return 5
//kthLargest.add(9);   // return 8
//kthLargest.add(4);   // return 8
private fun assertProductEquals(origin: IntArray, result: Int, addedValue: Int) = assertEquals(result, Solution4.KthLargest(3 ,origin).add(addedValue))
