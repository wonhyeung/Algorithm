class Solution {
    fun solution(x: Int): Boolean {
        var answer = true
       val a = x.toString().map {
            it.toString().toInt()
        }.sum()
        return x % a == 0
    }
}