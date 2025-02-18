class Solution {
    static int answer = 0;
    static boolean[][] visit;
    static int[] moveX = {0,0,-1,1};
    static int[] moveY = {1,-1,0,0};
    public int solution(int[][] maps) {
        visit = new boolean[maps.length][maps[0].length];
        return answer;
    }
    
    public static class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
