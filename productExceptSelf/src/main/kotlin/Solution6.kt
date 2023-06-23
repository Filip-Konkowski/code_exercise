import java.util.PriorityQueue

object Solution6 {
    fun lengthOfLastWord(s: String): Int
    {
        var counter = 0
        for (char in s.reversed()) {
            if (char == ' ' && counter == 0) {
                continue
            }

            if (char == ' ' && counter > 0) {
                return counter
            }

            counter++
        }
        return counter
    }
}
