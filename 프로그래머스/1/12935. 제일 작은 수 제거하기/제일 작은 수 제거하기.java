class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int idx = 0;
        int jump = 0;
        int[] answer;
        if(arr.length == 1) {
            answer = new int[1];
            answer[0] = -1;
        } else {
        for(int i = 0; i < arr.length; i++) {
            if(min >= arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        answer = new int[arr.length - 1];
        for (int j = 0; j < answer.length; j++) {
            if(arr[j] == min) {
                jump = 1;
            }
            answer[j] = arr[j+jump];
        }
        }
        return answer;
    }
}