import java.lang.Math;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length() == 4 || s.length() == 6) {
        for (int i = 0; i < s.length(); i++) {
            char c = ' ';
            c = s.charAt(i);
            if ((c - 1) > 63) {
               answer = false;
               break;
            } else {
                answer = true;
            }
        }
    } else {
            answer = false;
        }
        return answer;
    }
}