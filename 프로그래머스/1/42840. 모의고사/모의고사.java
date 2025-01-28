import java.lang.*;
import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int maxCount = 0;
        int[] countSum = new int[3];
        countSum[0] = countOne(answers);
        countSum[1] = countTwo(answers);
        countSum[2] = countThree(answers);
        int maxAns = Math.max(Math.max(countSum[0],countSum[1]),countSum[2]);
        for(int b = 0; b < countSum.length; b++) {
            if(countSum[b] == maxAns) {
                list.add(b+1);
            }
        }
        int[] answer = list.stream()
	                .mapToInt(Integer::intValue)
    	            .toArray();
        return answer;
    }
    
    private int countOne(int[] a) {
        int count = 0;
        int idx = 0;
        int i = 1;
        while(idx <= a.length - 1) {
            if(i == a[idx]) {
                count++;
            }
            i++;
            idx++;
            if(i == 6) {
                i = 1;
            }
        }
        return count;
    }
    
    private int countTwo(int[] b) {
        int count = 0;
        int idx = 0;
        int jIdx = 0;
        int[] j = {1, 3, 4, 5};
        while(idx <= b.length - 1) {
            if(idx % 2 == 0) {
                if(b[idx] == 2) {
                    count++;
                }
            } else {
                if(b[idx] == j[jIdx]) {
                    count++;
                }
                jIdx++;
                if(jIdx == 4) {
                    jIdx = 0;
                }
            }
            idx++;
        }
        return count;
    }
    
    private int countThree(int[] c) {
        int count = 0;
        int isTwo = 0;
        int idx = 0;
        int[] k = {3, 1, 2, 4, 5};
        int kIdx = 0;
        while(idx <= c.length - 1) {
            if(isTwo == 2) {
                isTwo = 0;
                kIdx++;
            }
            if(kIdx == 5) {
                kIdx = 0;
            }
            if(c[idx] == k[kIdx]) {
                count++;
            }
            idx++;
            isTwo++;
        }
        return count;
    }    
}