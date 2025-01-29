import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        answer = getPrimeNumber(n);
        return answer;
    }
    private int getPrimeNumber(int n) {
        boolean isPrimeNumber;
        int count = 0;
        if(n == 2) {
            return 1;
        } else {
           for(int i = 2; i <= n; i++) {
               isPrimeNumber = true;
             for(int j = 2; j <= Math.sqrt(i); j++) {
                     if(i % j == 0) {
                         isPrimeNumber = false;
                         break;
                     }
             }
             if(isPrimeNumber) {
                   count += 1;
               }
        }  
        return count;
    }
    }
}