import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> storage = new Stack<>();
        
        for(int move : moves) {
            int curTarget = getCurTarget(board, move);
            if(curTarget == 0) {
                continue;
            }
            
            if(storage.isEmpty() || storage.peek() != curTarget) {
                storage.push(curTarget);
                continue;
            }
            answer += 2;
            storage.pop();
        }
        
        
        return answer;
    }
    
    private int getCurTarget(int[][] board, int row) {
        for(int i =  0 ; i < board.length ; i++) {
            int curTarget = board[i][row - 1];
            if(curTarget != 0) {
                board[i][row - 1] = 0;
                return curTarget;
            }
        }
        return 0;
    }
    
}