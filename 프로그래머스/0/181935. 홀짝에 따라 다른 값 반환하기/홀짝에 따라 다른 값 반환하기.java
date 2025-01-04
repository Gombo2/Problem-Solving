class Solution {
    public int solution(int n) {
        int answer = 0;
        int pow = n % 2 == 1 ? 1 : 2;
        for(int i = n ; i > 0 ; i -= 2) {
            answer += Math.pow(i, pow);
        }
        
        return answer;
    }
}