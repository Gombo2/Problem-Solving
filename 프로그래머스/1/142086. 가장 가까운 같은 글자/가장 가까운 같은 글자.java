class Solution {
    public int[] solution(String s) {
        String[] splitS = s.split("");
        int[] answer = new int[splitS.length];
        for(int i = 0; i < splitS.length; i++) {
            for(int j = 0; j < splitS.length; j++) {
                if(i != j) {
                    if(splitS[i].equals(splitS[j]) && i - j > 0) {
                        answer[i] = Math.abs(i - j);
                    }
                }
            }
            if(answer[i] == 0) {
                answer[i] = -1;
            }
        }
        return answer;
    }
}