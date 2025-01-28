class Solution {
    public String solution(int[] food) {
        String answer = "";
        int temp = 0;
        for(int i = 1; i < food.length; i++) {
            temp = food[i]/2;
            for(int j = 0; j < temp; j++) {
                answer += i;
            }
        }
        answer += 0;
        for(int k = answer.length() - 1; k > 0; k--) {
            answer += answer.charAt(k-1);
        }
        return answer;
    }
}