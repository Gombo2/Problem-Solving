import java.util.*;

public class Solution {
    public int solution(int n, int[][] q, int[] ans) {
        List<List<Integer>> combinations = new ArrayList<>();
        //각 케이스 List로 만들고 List에 담음.
        allCombinations(n, 5, 1, new ArrayList<>(), combinations);
        //모든 경우의수
        int count = 0;
        
        for (List<Integer> combination : combinations) {
            if (isTrue(combination, q, ans)) {
                count++;
            }
        }
        
        return count;
    }

    private void allCombinations(int n, int depth, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == depth) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n; i++) {
            current.add(i);
            allCombinations(n, depth, i + 1, current, result);
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
