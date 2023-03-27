import kotlin.math.*
class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val a = sqrt(n.toDouble()).toLong()
        if( a* a == n) 
        answer =(a+1) * (a+1) 
        else answer = -1
        return answer
    }
}
