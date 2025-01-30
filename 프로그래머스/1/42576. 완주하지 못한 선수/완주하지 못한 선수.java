import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> personMapByShow = new HashMap<>();
        for(String curParticipant : participant) {
            Integer showCount = personMapByShow.get(curParticipant);
            showCount = showCount == null ? 1 : showCount + 1;
            personMapByShow.put(curParticipant, showCount);
        }
        
        for(String curCompletion : completion) {
            personMapByShow.put(curCompletion, personMapByShow.get(curCompletion) - 1);
        }
        
        String answer = "";
        for(Map.Entry<String, Integer> curEntry : personMapByShow.entrySet()) {
            if (curEntry.getValue() != 0) {
                answer = curEntry.getKey();
                break;
            }
        }
        return answer;
    }
}