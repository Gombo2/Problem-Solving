import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>(); // 바구니 역할

        for (int move : moves) {
            int columnIdx = move - 1; // 1-based index -> 0-based index 변환

            // 해당 열에서 가장 위에 있는 인형 찾기
            int pickedDoll = 0;
            for (int row = 0; row < board.length; row++) {
                if (board[row][columnIdx] != 0) { // 인형이 있는 경우
                    pickedDoll = board[row][columnIdx];
                    board[row][columnIdx] = 0; // 인형을 뽑았으므로 빈칸 처리
                    break;
                }
            }

            // 만약 인형을 찾지 못했으면 continue
            if (pickedDoll == 0) continue;

            // 바구니에 인형 넣기 (같은 인형이면 터뜨리기)
            if (!basket.isEmpty() && basket.peek() == pickedDoll) {
                basket.pop(); // 같은 인형을 제거
                answer += 2;  // 터진 인형 개수 증가 (2개)
            } else {
                basket.push(pickedDoll); // 바구니에 인형 추가
            }
        }

        return answer;
    }
}
