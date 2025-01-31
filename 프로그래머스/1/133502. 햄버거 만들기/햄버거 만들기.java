import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int deleteFour = 0;
        Stack<Integer> num = new Stack<Integer>();
        for(int i = 0; i < ingredient.length; i++) {
            num.push(ingredient[i]);
            if(num.size() <= 3) {
                continue;
            } else { 
                if(num.get(i - deleteFour) == 1 && num.get(i-1 - deleteFour) == 3 
                   && num.get(i-2 - deleteFour) == 2 && num.get(i-3 - deleteFour) == 1) {
                    num.pop();
                    num.pop();
                    num.pop();
                    num.pop();
                    deleteFour += 4;
                    answer++;
                }
            }
        }
        return answer;
    }
}