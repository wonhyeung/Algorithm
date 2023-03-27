class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        if(a > b) {
            for(i in b..a) {
                answer += i
            }
        }
            else { 
                for(j in a..b) {
                answer += j
                }
            }
        
        return answer
    }
}