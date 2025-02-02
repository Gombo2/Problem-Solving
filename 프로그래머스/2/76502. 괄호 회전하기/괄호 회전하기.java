import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0) {
                if(isTrue(s)) {
                    answer++;
                }
            } else {
                s = rotateRight(s);
                if(isTrue(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
     private String rotateRight(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
    
    private boolean isTrue(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
            } else if((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '[' && s.charAt(i) == ']')
                     || (st.peek() == '{' && s.charAt(i) == '}')) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        if(st.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}