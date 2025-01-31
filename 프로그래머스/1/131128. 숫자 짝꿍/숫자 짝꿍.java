import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int minCount = Math.min(xCount[i], yCount[i]);
            result.append(String.valueOf(i).repeat(minCount));
        }

        if (result.length() == 0) return "-1";

        if (result.charAt(0) == '0') return "0";

        return result.toString();
    }
}
