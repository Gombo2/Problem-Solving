import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        String[] binaryAndZeroCount = new String[2];
        
        while(!s.equals("1")) {
            binaryAndZeroCount = tenToBinary(s);
            s = binaryAndZeroCount[0];
            answer[1] += Integer.parseInt(binaryAndZeroCount[1]); 
            answer[0]++;
        }
        
        return answer;
    }
    
    private String[] tenToBinary(String s) {
        String[] binary = new String[2];
        int tempLength = s.length();
        s = s.replaceAll("0","");
        binary[1] = "" + (tempLength - s.length());
        binary[0] = "";
        if(s.equals("1")) {
            binary[0] = "1";
            return binary;
        
        }
        
        int num = s.length();
       
        while(num != 0) {
            if(num % 2 == 0) {
                binary[0] += "" + "0";
            } else {
                binary[0] += "" + "1";
            }
            num /= 2;
        }
        
        return binary;
    }
}