class Solution {
    public int solution(int n) {
        int answer = 0;
        int idx = 1;
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
            if(sum > n) {
                i = idx;
                sum = 0;
                idx++;                
            } else if (sum == n) {
                answer++;
                i = idx;
                idx++;
            }
        }
        return answer;
    }
}