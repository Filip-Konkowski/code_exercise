
import java.util.ArrayDeque
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
object Solution12 {



    fun isValid(s: String): Boolean {
        // val stack = ArrayDeque<Char>()
        // for (char in s) {
        //     when (char) {
        //         '{', '[', '(' -> stack.add(char)
        //         ')' -> if (stack.isEmpty() || stack.removeLast() != '(') { return false }
        //         ']' -> if (stack.isEmpty() || stack.removeLast() != '[') { return false }
        //         '}' -> if (stack.isEmpty() || stack.removeLast() != '{') { return false }
        //     }
        // }

        // return stack.isEmpty()




        val stack = ArrayDeque<Char>()
        val map = mapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in s) {
            if (char in map.values) {
                stack.add(char)
            } else if (char in map.keys) {
                if (stack.isEmpty() || stack.removeLast() != map[char]) {
                    return false
                }
            }
        }

        return stack.isEmpty()
    }

}

