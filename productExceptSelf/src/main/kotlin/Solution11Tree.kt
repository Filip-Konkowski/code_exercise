

object Solution11Tree {

    fun search(nums: IntArray, target: Int): Int {
        return binarySearch(nums, target, 0, nums.size -1)

    }




    fun binarySearch(nums: IntArray, target: Int, start: Int, end: Int): Int {
        if (start > end) {
            return -1
        }

        val half = (end + start) / 2
        val current = nums[half]

        if (current == target) {
            return half
        }

        if (target > current) {
            return binarySearch(nums, target, half + 1, end)
        }

        if (target < current) {
            return binarySearch(nums, target, start, half - 1)
        }

        return half
    }

    fun binarySearch(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1

        while (start <= end) {
            val mid = start + (end - start) / 2
            val current = nums[mid]

            when {
                current == target -> return mid
                target > current -> start = mid + 1
                else -> end = mid - 1
            }
        }

        return -1
    }

//    private fun binSearch(lo: Int, hi: Int, target: Int): Int {
//        if (lo == hi) return if(nums[lo] == target) lo else -1
//        val mid = (lo+hi)/2
//        return if (nums[mid] >= target) binSearch(lo, mid, target)
//        else binSearch(mid+1, hi, target)
//    }


}

