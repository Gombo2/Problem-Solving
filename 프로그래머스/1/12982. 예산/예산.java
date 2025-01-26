import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int count = 0;
        int idx = 0;
        int firstBudget = budget;
        Arrays.sort(d);
        for(int i = 0; i < d.length; i++) {
            budget = firstBudget;
            count = 0;
            idx = 0;
            while(budget > 0) {
                if(budget >= d[i+idx]) {
                    budget -= d[i+idx];
                    count++;
                }
                if(i+idx == d.length - 1) {
                    break;
                }
                idx++;
            }
            if(answer < count) {
                answer = count;
            }
        }
        return answer;
    }
}