class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var a = num
        while(true) {
            if(a == 1) {
                break
            }
            else if(answer == 500) {
                answer = -1         
                break
            } else 
            answer += 1
                 if(a % 2 ==0) {
               a = a / 2 
            }
            else{ 
                var temp  = a.toDouble()
                    temp = temp * 3 + 1
                    a = temp.toInt()
            }      
        }
        return answer
    }
}