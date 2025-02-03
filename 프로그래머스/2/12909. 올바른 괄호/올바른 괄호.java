import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> st = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            if(st.isEmpty()) {
                st.push(s.charAt(i));
                continue;
            }
            if(st.peek() == '(' && s.charAt(i) == ')') {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        return st.isEmpty() ? true : false;
    }
}