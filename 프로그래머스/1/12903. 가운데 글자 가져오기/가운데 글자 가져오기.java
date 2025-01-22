class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sSplit = s.split("");
        if(sSplit.length % 2 == 1) {
            answer += sSplit[(sSplit.length/2)]; 
        } else {
            answer += sSplit[(sSplit.length/2) - 1];
            answer += sSplit[(sSplit.length/2)];
        }
        return answer;
    }
}