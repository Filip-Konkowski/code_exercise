object Solution3 {
    fun longestConsecutive(nums: IntArray): Int {
        val setNums = nums.toSet()
        var longest = 0

        for (num in nums) {
            // check if left side exists, so we will have start of sequence
            val leftNum: Int = num - 1
            if (!setNums.contains(leftNum)) {
                var currentLongest = 1
                while(setNums.contains(num + currentLongest)) {
                    currentLongest++
                }
                longest = maxOf(currentLongest, longest)
            }
        }
        return longest
    }
}
