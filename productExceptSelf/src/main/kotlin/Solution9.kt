
import java.util.PriorityQueue

object Solution9 {

    // Using floyd's algorithm to halve the linked list.
    fun isPalindrome(head: ListNode?): Boolean
    {
        var slow = head
        var fast = head

        while (fast?.next != null && fast.next?.next != null) {
            slow = slow?.next
            fast = fast.next?.next
        }

        fun reverse(node: ListNode?): ListNode? {
            var currHead = node
            while (node?.next != null) {
                val nextNode = node.next
                node.next = nextNode?.next
                nextNode?.next = currHead
                currHead = nextNode
            }
            return currHead
        }

        fast = head
        var reversed = reverse(slow?.next)
        var isPalindrome = true
        while (isPalindrome && reversed != null) {
            isPalindrome = reversed.`val` == fast?.`val`
            reversed = reversed.next
            fast = fast?.next
        }

        reverse(slow?.next)
        return isPalindrome
    }
}

data class Node(val value: Int, var nextNode: Node?) {
    override fun toString(): String {
        return "Node(value = $value, nextNode = $nextNode)"
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}