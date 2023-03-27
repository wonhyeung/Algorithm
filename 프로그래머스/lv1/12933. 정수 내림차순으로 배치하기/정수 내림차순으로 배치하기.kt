class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
       answer = n.toString().toList().sorted().reversed().joinToString("").toLong()
        return answer
    }
}