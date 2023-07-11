import org.junit.Test
import kotlin.test.assertEquals

// 121. Best Time to Buy and Sell Stock
//You are given an array prices where prices[i] is the price of a given stock on the ith day.
//You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
//Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
class Solution10Test
{
    @Test
    fun `transactions are done and the max profit = 5`() =
            assertProductEquals(
                intArrayOf(7,1,5,3,6,4),
                5,
            )

    fun `no transactions are done and the max profit = 0`() =
        assertProductEquals(
                intArrayOf(7,6,4,3,1),
                0,
            )

    private fun assertProductEquals(origin: IntArray, result: Int) = assertEquals(result, Solution10.maxProfit(origin))
}