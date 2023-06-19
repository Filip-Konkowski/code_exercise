import java.util.PriorityQueue

object Solution5 {
    fun singleNumber(nums: IntArray): Int
    {
        val list = mutableListOf<Int>()
        for (num in nums) {
            if(!list.contains(num)) {
                list.add(num)
            } else {
                list.remove(num)
            }
        }

        return list.get(0)
    }
}
