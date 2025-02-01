import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] allStudent = new int[n]; // 0 -> 옷을 입고있따. 1 -> 여분옷이 있따. -1 -> 옷뺏겼다.
        for(int i = 0 ; i < reserve.length ; i++) {
            allStudent[reserve[i] - 1] += 1;
        }
        for(int i = 0 ; i < lost.length ; i++) {
            allStudent[lost[i] - 1] -= 1;
        }
        int idx = 0;
        for(int i = 0 ; i < allStudent.length ; i++) {
            if(allStudent[i] >= 0) {
                answer += 1;
            }
        }
        while(idx < n) {
            if(allStudent[idx] == -1) {
                if(idx == 0) {
                    if(allStudent[idx + 1] == 1) {
                        allStudent[idx] = 0;
                        allStudent[idx + 1] = 0;
                        answer++;
                    }
                } else if(idx == allStudent.length - 1) {
                    if(allStudent[idx - 1] == 1) {
                        allStudent[idx] = 0;
                        allStudent[idx - 1] = 0;
                        answer++;
                    }
                } else {
                     if(allStudent[idx - 1] == 1) {
                        allStudent[idx] = 0;
                        allStudent[idx - 1] = 0;
                        answer++;
                    } else if(allStudent[idx + 1] == 1) {
                        allStudent[idx] = 0;
                        allStudent[idx + 1] = 0;
                        answer++;
                    }
                }
            }
            idx++;
        }
        return answer;
    }
}