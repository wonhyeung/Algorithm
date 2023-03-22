class Solution {
    fun solution(my_string: String): String {
        var answer: String = ""
        answer = my_string.toLowerCase().toList().sorted().joinToString("")
        return answer
    }
}