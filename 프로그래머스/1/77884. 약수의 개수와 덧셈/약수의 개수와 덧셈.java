import java.util.*;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int[] number = num(left, right);
        answer = divNum(number);
        return answer;
    }
    
    private int[] num(int a, int b) {
        int idx = 0;
        int[] sum = new int[b - a + 1];
        for(int i = 0; i < sum.length; i++) {
            sum[i] = a + idx;
            idx++;
        }
        return sum;
    }
    
    private int divNum(int[] numb) {
        int sum = 0;
        int count = 0;
        int natural = 1;
        for(int j = 0; j < numb.length; j++) {
            count = 0;
            natural = 1;
            while(natural < numb[j]) {
                if(numb[j] % natural == 0) {
                    count++;
                }
                natural++;
            }
            if(count % 2 == 0) {
                sum += numb[j];
            } else {
                sum -= numb[j];
            }
        }
        
        return Math.abs(sum);
    }
}