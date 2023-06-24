import org.junit.Test
import kotlin.test.assertEquals

class Solution7Test
{
    @Test
    fun `check string is palindrome`() =
            assertProductEquals(
                    "A man, a plan, a canal: Panama",
                    true,

            )

    @Test
    fun `check string not palindrome`() =
            assertProductEquals(
                    "race a car",
                    false,
                    )

    private fun assertProductEquals(origin: String, result: Boolean) = assertEquals(result, Solution7.isPalindrome(origin))
}