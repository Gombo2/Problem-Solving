import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        String[] splited = s.split(" ");   
        for(int i = 0 ; i < splited.length; i++) {
            answer += isChangeToUpper(splited[i]) + " ";
        }
        
        return answer.substring(0, s.length());
    }
    
    private String isChangeToUpper(String s) {
        String word = "";
        if(s.equals(" ")) {
            return " ";
        }
        for(int i = 0; i < s.length(); i++) {
           if(i == 0 && s.charAt(i) >= 97 && s.charAt(i) <= 122) {
               word += Character.toString(s.charAt(i)).toUpperCase();
           } else {
               word += Character.toString(s.charAt(i));
           } 
        }
        
        return word;
    }
}