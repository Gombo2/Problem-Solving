class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int i = 0;
       while (n >= answer) {
           answer += numbers[i];
           i++;
       }
        return answer;
    }
}