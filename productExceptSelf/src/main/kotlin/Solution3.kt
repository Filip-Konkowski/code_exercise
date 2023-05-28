object Solution3 {
    fun longestConsecutive(nums: IntArray): Int {
        val setNums = setOf(nums)
        var longest = 0
        println(setNums)
        for (num in nums) {
            // check if left side exists, so we will have start of sequence
            val leftNum: Int = num - 1
//            if (setNums.contains(leftNum)) {
//                var currentLongest = 0
//                println("here we go")
//            }


        }


        return 1
    }
}
