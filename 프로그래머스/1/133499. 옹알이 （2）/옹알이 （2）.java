import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i < babbling.length; i++) {
            String converted = babbling[i]
                .replaceAll("aya", "A")
                .replaceAll("ye", "B")
                .replaceAll("woo", "C")
                .replaceAll("ma", "D");

            if (!converted.matches("[ABCD]+")) {
                continue; 
            }

            
            if (converted.contains("AA") || converted.contains("BB") ||
                converted.contains("CC") || converted.contains("DD")) {
                continue;
            }

            answer++;
        }
        
        return answer;
    }
}
