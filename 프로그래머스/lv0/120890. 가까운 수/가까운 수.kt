import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var min : Int = 100
        val arr = ArrayList<Int>()
        
        for(i in array.indices) {
            if(abs(array[i] - n) < min) {
                min = abs(array[i]-n)
            }        
        }
        
        for(i in array.indices) {
            if(abs(array[i] -n) == min) {
                arr.add(array[i])
            }
        }
        arr.sort()
        return arr[0]
    }
}