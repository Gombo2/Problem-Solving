import java.util.*;

public class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        List<List<Integer>> combinations = new ArrayList<>();
        allCombinations(n, 5, 1, new ArrayList<>(), combinations);
        int count = 0;
        for (List<Integer> combination : combinations) {
            if (isTrue(combination, q, ans)) {
                count++;
            }
        }
        return count;
    }

    private void allCombinations(int n, int r, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == r) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            allCombinations(n, r, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    private boolean isTrue(List<Integer> combination, int[][] q, int[] ans) {
        for (int i = 0; i < q.length; i++) {
            int count = 0;
            for (int num : combination) {
                for (int j = 0; j < 5; j++) {
                    if (num == q[i][j]) {
                        count++;
                        break;
                    }
                }
            }
            if (count != ans[i]) {
                return false;
            }
        }
        return true;
    }
}
