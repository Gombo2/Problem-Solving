class Solution {
    static int[] moveX = {0, 1, -1};  // 아래, 오른쪽, 왼쪽 위
    static int[] moveY = {1, 0, -1};  

    public int[] solution(int n) {
        int allBoxCases = getSize(n); 
        int[] answer = new int[allBoxCases];
        int[][] boxArr = new int[n][n];  
        
        int curX = 0, curY = 0, num = 1, direction = 0;
        
        while (num <= allBoxCases) {
            boxArr[curY][curX] = num++; 
            int nextX = curX + moveX[direction];
            int nextY = curY + moveY[direction];

            if (!checkBoundary(n, nextX, nextY) || boxArr[nextY][nextX] != 0) {
                direction = (direction + 1) % 3;  
                nextX = curX + moveX[direction];
                nextY = curY + moveY[direction];
            }

            curX = nextX;
            curY = nextY;
        }
        
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) { 
                answer[index++] = boxArr[i][j];  
            }
        }

        return answer;
    }
    
    private static int getSize(int n) {
        return n * (n + 1) / 2; 
    }
    
    public static boolean checkBoundary(int n, int curX, int curY) {
        return curX >= 0 && curX < n && curY >= 0 && curY < n;
    }
}
