class Solution {
    fun solution(before: String, after: String): Int {
        var answer: Int = 0
        var a = after.toList().sorted() 
        var b = before.toList().sorted()
        if(a == b) answer = 1 
        else answer = 0
        return answer
    }
}