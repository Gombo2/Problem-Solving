import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};
        Map<String,Integer> hm = new HashMap<>();
        hm.put(words[0],0);
        for(int i = 1; i < words.length; i++) {
            if(hm.get(words[i]) == null && 
               words[i-1].charAt(words[i-1].length() -1) == words[i].charAt(0)) {
                hm.put(words[i], 0);
            } else {
            answer[0] = (i % n) + 1;
            answer[1] = (i / n) + 1;
            break;
            }    
        }
        return answer;
    }
}