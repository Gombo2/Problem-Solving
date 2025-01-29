class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int j = 1;
        int count = 0;
        for(int i = 1; i <= number; i++) {
            count = getDivisorsCount(i);
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }
        return answer;
    }
    
     private int getDivisorsCount(int n) {
        int count = 0;
        for (int j = 1; j * j <= n; j++) { 
            if (n % j == 0) {
                count++; // j가 약수일 때
                if (j != n / j) {
                    count++;
                }
            }
        }
        return count;
    }
}