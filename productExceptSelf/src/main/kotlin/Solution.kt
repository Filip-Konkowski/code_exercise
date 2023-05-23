object Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        var rest = IntArray(nums.size) { 1 }
        var pre = 1

        for (i in 0 until nums.size) {
            rest[i] = pre
            pre *=  nums[i]
        }

        var post = 1
        for (i in (nums.size-1) downTo 0) {
            rest[i] *= post
            post *= nums[i]
        }

        return rest
    }
}
