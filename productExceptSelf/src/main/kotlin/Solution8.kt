import java.util.PriorityQueue

object Solution8 {
    fun majorityElement(nums: IntArray): Int
    {
        var map = HashMap<Int, Int>()

        for (num in nums) {
            map[num] = map.getOrPut(num) { 0 } + 1
        }

        val maxValue = map.maxByOrNull {it.value} ?.key

        return maxValue ?: 0
    }
}
