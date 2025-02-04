import java.util.*;
import java.lang.*;
class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];
        xCount = getEachCount(xCount, X);
        yCount = getEachCount(yCount, Y);
        
        StringBuilder answer = new StringBuilder();
        
        for(int j = xCount.length - 1; j >= 0; j--) {
           int minCount = Math.min(xCount[j],yCount[j]);
           for(int k = 0; k < minCount; k++) {
               answer.append(j);
           } 
        }
        
        return getResult(answer.toString());
    }
    
    private int[] getEachCount(int[] sum, String str) {
        for(char i : str.toCharArray()) {
            sum[i - '0']++;
        }
        return sum;
    }
    
    
    private String getResult(String s) {
        if(s.length() == 0) {
            return "-1";
        } else if(s.charAt(0) == '0') {
            return "0";
        } else {
            return s;
        }
    }
}