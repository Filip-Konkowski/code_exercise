import java.util.PriorityQueue

object Solution7 {
    fun isPalindrome(s: String): Boolean
    {
        var left = 0
        var right = s.length - 1
        while (left < right) {
            while (left < right && !s[left].isLetterOrDigit()) {
                left++
            }

            while (left < right && !s[right].isLetterOrDigit()) {
                right--
            }

            if (s[right].toLowerCase() != s[left].toLowerCase()) {
                return false
            }
            left++
            right--
        }

        return true
    }
}
