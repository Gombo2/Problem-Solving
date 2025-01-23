import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n,m);
        int min = Math.min(n,m);
        int idx1 = 0;
        int idx2 = 1;
        for(int i = 1; i <= max; i++) {
            if(n % i == 0 && m % i == 0) {
                idx1 = i;
            }
        }
        idx2 = (max / idx1) * min;
        answer[0] = idx1;
        answer[1] = idx2;
       
        return answer;
    }
}