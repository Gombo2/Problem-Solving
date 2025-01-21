import java.lang.Math;

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long small = 0;
        long big = 0;
        
        small = a < b ? a : b;
        big = a > b ? a : b;
        
        for(long i = small; i <= big; i++){
            answer += i;
        }
        return answer;
    }
}