class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] star = phone_number.split("");
        for(int i = 0; i < star.length; i++) {
            if(i < star.length - 4) {
            answer += "*";
            } else {
            answer += star[i];
            }
        }
        return answer;
    }
}