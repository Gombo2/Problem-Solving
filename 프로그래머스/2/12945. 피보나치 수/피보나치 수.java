class Solution {
    static long[] memo = new long[1000000];
    public long solution(int n) {
        long answer = 0;
        answer = fibonacci(n); 
        return answer;
    }
    
    private long fibonacci(int n) {
        if(n <= 1) {
            return n;
        } else if(memo[n] != 0) {
            return memo[n];
        } else {
            return memo[n] = (fibonacci(n-1) + fibonacci(n-2)) % 1234567;
        }
    }
}