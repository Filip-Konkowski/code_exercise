import java.util.PriorityQueue

object Solution10 {
    fun maxProfit(prices: IntArray): Int
    {
        prices.foldIndexed<Int>(prices[0]) { i, min, n ->
            prices[i] = n - min
            if (n < min) n else min
        }
        return prices.maxOrNull() ?: 0
    }
}
