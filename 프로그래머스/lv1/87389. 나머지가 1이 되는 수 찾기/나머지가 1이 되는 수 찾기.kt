class Solution {
    fun solution(n: Int): Int {
        var x = arrayOf<Int>()
        for(i in 1..n) {
            if(n % i == 1) {
                x += i
            }
        }
        return x[0]
    }
}