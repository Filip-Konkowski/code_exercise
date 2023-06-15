import java.util.PriorityQueue

object Solution4 {
    class KthLargest(k: Int, nums: IntArray) {


        private var PQueue = PriorityQueue<Int>()
        private var k: Int
        init {
            this.k = k
            addAll(nums)
        }

        private fun addAll(numbers: IntArray) {
            for (number in numbers) {
                PQueue.offer(number)
                removeOverLimit()
            }
        }

        private fun removeOverLimit() {

            while (PQueue.size > k) {
                PQueue.poll()
            }
        }
        fun add(`val`: Int): Int {
            PQueue.offer(`val`)
            removeOverLimit()
            return PQueue.peek()
        }

    }
}
