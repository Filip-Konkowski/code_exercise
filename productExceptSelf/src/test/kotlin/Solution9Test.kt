import org.junit.Test
import kotlin.test.assertEquals

class Solution9Test
{

    @Test
    fun `linked list is palindrome`() =
        assertProductEquals(
            getPalindromeLinkedList(),
            true,
        )

    @Test
    fun `linked list is not palindrome`() =
        assertProductEquals(
            getNotPalindromeLinkedList(),
            false,
        )

    private fun getPalindromeLinkedList(): ListNode? {
        val node1 = ListNode(1)
        val node2 = ListNode(3)
        val node3 = ListNode(3)
        val node4 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4

        var current: ListNode? = node1

        return current
    }

    private fun getNotPalindromeLinkedList(): ListNode? {
        val node1 = ListNode(1)
        val node2 = ListNode(3)
        val node3 = ListNode(2)
        val node4 = ListNode(1)

        node1.next = node2
        node2.next = node3
        node3.next = node4

        var current: ListNode? = node1

        return current
    }
    private fun assertProductEquals(origin: ListNode?, result: Boolean) = assertEquals(result, Solution9.isPalindrome(origin))
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}