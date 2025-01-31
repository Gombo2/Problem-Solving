import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<String, Integer> category = new HashMap<>();
        List<String> st = List.of("R","T","C","F","J","M","A","N");
            for(String key : st) {
                category.put(key,0);
            }
        int[] score = {3,2,1,0,1,2,3};
        for(int i = 0; i < choices.length; i++) {
            String left =  Character.toString(survey[i].charAt(0));
            String right = Character.toString(survey[i].charAt(1));
            if(choices[i] > 4) {
                category.put(right, category.get(right) + score[choices[i] - 1]);
            } else if (choices[i] < 4) {
                category.put(left, category.get(left) + score[choices[i] - 1]);
            }   
        }
        answer += category.get("R") >= category.get("T") ? "R" : "T";
        answer += category.get("C") >= category.get("F") ? "C" : "F";
        answer += category.get("J") >= category.get("M") ? "J" : "M";
        answer += category.get("A") >= category.get("N") ? "A" : "N";
        
        return answer;
    }
}