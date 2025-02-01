import java.util.*;

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int rows = park.length;
        int cols = park[0].length;
        Arrays.sort(mats);
        for (int k = mats.length - 1; k >= 0; k--) {
            int size = mats[k];

         
            for (int i = 0; i <= rows - size; i++) {
                for (int j = 0; j <= cols - size; j++) {
                    if (canPlaceMat(park, i, j, size)) {
                        return size; 
                    }
                }
            }
        }

        return -1; 
    }

    private boolean canPlaceMat(String[][] park, int x, int y, int size) {
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (!park[i][j].equals("-1")) {
                    return false;
                }
            }
        }
        return true;
    }
}
