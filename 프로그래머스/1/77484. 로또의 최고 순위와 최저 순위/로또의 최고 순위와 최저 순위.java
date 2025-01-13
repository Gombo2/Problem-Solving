class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zeroSum = 0;
        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0; j < lottos.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    lottos[i] = 51;
                    win_nums[j] = 50;
                    count++;
                }
                else if (lottos[i] == 0) {
                    lottos[i] = 52;
                    zeroSum++;
                }
            }
        }
        if(count + zeroSum >= 2) {
             answer[0] = 7 - (count + zeroSum);
        } else {
            answer[0] = 6;  
        }
        if(count >= 2) {
        answer[1] = 7 - (count);
        } else {
            answer[1] = 6;
        }
        return answer;
    }
}