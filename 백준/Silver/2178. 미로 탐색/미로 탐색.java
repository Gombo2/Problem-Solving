import java.io.*;
import java.util.*;

public class Main {
    static int rowCases;
    static int columnCases;
    static int[][] map;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        rowCases = Integer.parseInt(st.nextToken());
        columnCases = Integer.parseInt(st.nextToken());

        map = new int[rowCases][columnCases];
        for (int i = 0; i < rowCases; i++) {
            String s = br.readLine();
            for (int j = 0; j < columnCases; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        int ans = bfs(0, 0, 1);
        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
    }

    private static int bfs(int x, int y, int count) {
        Queue<Node> queue = new ArrayDeque<>();
        queue.offer(new Node(x, y, count));
        visited = new boolean[rowCases][columnCases];
        visited[x][y] = true;

        int[][] move = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; 
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int d = 0; d < move.length; d++) {
                int curX = node.x + move[d][0];
                int curY = node.y + move[d][1];

                if (curX == rowCases - 1 && curY == columnCases - 1) {
                    return node.count + 1;
                }

                if (checkStatus(curX, curY)) {
                    visited[curX][curY] = true;  
                    queue.offer(new Node(curX, curY, node.count + 1));
                }
            }
        }
        return -1;
    }

    private static boolean checkStatus(int nx, int ny) {
        return 0 <= nx && nx < rowCases && 0 <= ny && ny < columnCases && !visited[nx][ny] && map[nx][ny] == 1;
    }

    private static class Node {
        int x, y, count;

        public Node(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}
