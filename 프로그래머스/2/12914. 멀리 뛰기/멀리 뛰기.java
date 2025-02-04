//f(1) = 1, f(2) = 2 f(n) = f(n-1) + f(n-2); [n >= 3]

class Solution {
    static long[] memo = new long[2000];
    public long solution(int n) {
        
        long answer = 0;
        answer = fibonacci(n) % (long)1234567;
    
            
        return answer;
    }
    
    private long fibonacci(int n) {
        if (n < 3)
             return n;
        else if (memo[n] != 0)
            return memo[n] % 1234567;
        else
            return memo[n] = (fibonacci(n - 2) + fibonacci(n - 1)) %1234567 ;
    }
}