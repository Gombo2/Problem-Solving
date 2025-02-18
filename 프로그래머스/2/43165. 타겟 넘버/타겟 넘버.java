class Solution {
    static int answer = 0;
    public int solution(int[] numbers, int target) {    
        dfs(0, numbers, target, 0);
        return answer;
    }
    
    private static void dfs(int depth, int[] numbers, int target, int sum) {
        if(depth == numbers.length) { //끝까지 탐색완료했을때
            if(sum == target) { // 연산결과가 target과 같은경우
                answer++;
            }
            return;
        }
        
        dfs(depth + 1, numbers, target, sum + numbers[depth]); // +
        
        dfs(depth + 1, numbers, target, sum - numbers[depth]); // -
    }
}