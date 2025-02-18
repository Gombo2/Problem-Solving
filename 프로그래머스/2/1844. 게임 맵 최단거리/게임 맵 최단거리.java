import java.util.*;

class Solution {
    static int answer = 0;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {1, -1, 0, 0};
    static int[][] map;
    static int curX = 0;
    static int curY = 0;
    static boolean[][] visit;
    public static int solution(int[][] maps) {
        map = maps;
        
        int n = maps.length;
        int m = maps[0].length;
        visit = new boolean[n][m];
    
        visit[0][0] = true;
        
        bfs(0,0);
        
        answer = map[map.length - 1][map[0].length -1];
        
        if(map[map.length - 1][map[0].length -1] == 1) {
            return -1;
        } else {
            return answer;    
        }
    }
    
    private static void bfs(int y, int x) {
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(x,y));
        
        while(!que.isEmpty()) {
            Node n = que.poll();
            
            for(int i = 0; i < 4; i++) {
                curX = n.x + moveX[i];
                curY = n.y + moveY[i];
                
                if(checkBoundary() && !visit[curY][curX] && map[curY][curX] == 1) {
                    que.offer(new Node(curX,curY));
                    
                    map[curY][curX] = map[n.y][n.x] + 1;
                    
                    visit[curY][curX] = true;
                }
            }
            
        }
        
    }
    
    public static class Node {
        int x;
        int y;
        
        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    
    public static boolean checkBoundary() {
        if(curX < 0 || curX >= map[0].length || curY < 0 || curY >= map.length) {
            return false;
        } else {
            return true;
        }
    }
    
    
}