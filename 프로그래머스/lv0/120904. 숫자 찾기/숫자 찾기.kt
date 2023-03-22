class Solution {
    fun solution(num: Int, k: Int): Int {
        var answer: Int = 0
        var a = num.toString()
        var b = k.toString()
        if(a.contains(b)){
            answer += a.indexOf(b) + 1
        } else {
            answer = -1
        }
        return answer
    }
}