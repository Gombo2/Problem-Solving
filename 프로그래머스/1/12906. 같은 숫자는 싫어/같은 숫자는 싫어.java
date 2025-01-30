import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> num = new Stack<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(num.isEmpty()) {
                num.push(arr[i]);
            }
            if(num.peek().intValue() != arr[i]) {
                num.push(arr[i]);        
            }
            
        }
        
        int[] answer = new int[num.size()];
        for (int i = num.size() - 1; i >= 0; i--) {
            answer[i] = num.pop();
        }
        return answer;
    }
}