class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        for(i in 0 until n) {
            answer[i] = (i + 1) *x.toLong()
        }
        return answer
    }
}