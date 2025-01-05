class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int i = 0;
        while (i < num_list.length) {
            answer[i] = num_list[i];
            i++;
        }
        if (answer[i-1] > answer[i-2]) {
            answer[num_list.length] = answer[i-1] - answer[i -2];
        } else {
            answer[num_list.length] = answer[i-1] * 2;
        }
        return answer;
    }
}