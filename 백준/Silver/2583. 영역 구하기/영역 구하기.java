import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] visited;
    static int countSize;
    static List<Integer> countSizeList;
    static int[] moveX = {0, 0, -1, 1};
    static int[] moveY = {1, -1, 0, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int rowCases = Integer.parseInt(st.nextToken());  // M (세로)
        int columnCases = Integer.parseInt(st.nextToken());  // N (가로)
        int squareCases = Integer.parseInt(st.nextToken());  // 직사각형 개수

        map = new int[rowCases][columnCases];
        visited = new boolean[rowCases][columnCases];
        countSizeList = new ArrayList<>();

        // 직사각형을 채우는 과정
        for (int i = 0; i < squareCases; i++) {
            st = new StringTokenizer(br.readLine());

            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            for (int j = rowCases - endY; j < rowCases - startY; j++) {
                for (int k = startX; k < endX; k++) {
                    map[j][k] = 1;
                }
            }
        }

        for (int i = 0; i < rowCases; i++) {
            for (int j = 0; j < columnCases; j++) {
                if (map[i][j] == 0 && !visited[i][j]) {
                    countSize = 1;
                    bfs(j, i);
                    countSizeList.add(countSize);
                }
            }
        }

        Collections.sort(countSizeList);

        sb.append(countSizeList.size()).append("\n");
        for (int count : countSizeList) {
            sb.append(count).append(" ");
        }

        System.out.println(sb);
    }

    private static void bfs(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        que.offer(new Node(x, y));
        visited[y][x] = true;

        while (!que.isEmpty()) {
            Node node = que.poll();

            for (int i = 0; i < 4; i++) {
                int curX = node.x + moveX[i];
                int curY = node.y + moveY[i];

                if (checkBoundary(curX, curY) && map[curY][curX] == 0 && !visited[curY][curX]) {
                    que.offer(new Node(curX, curY));
                    visited[curY][curX] = true;
                    countSize++;
                }
            }
        }
    }

    private static boolean checkBoundary(int x, int y) {
        return x >= 0 && x < map[0].length && y >= 0 && y < map.length;
    }

    public static class Node {
        int x, y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}

