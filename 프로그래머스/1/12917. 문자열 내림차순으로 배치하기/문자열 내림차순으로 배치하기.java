import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] splitS = s.split("");
        Arrays.sort(splitS, Comparator.reverseOrder());
        for(int i = 0; i < splitS.length; i++) {
            answer += splitS[i];
        }
        return answer;
    }
}