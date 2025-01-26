class Solution {
    public String solution(String s, int n) {
        String answer = "";
        String[] splitSol = s.split("");
        char idx;
        for(int i = 0; i < splitSol.length; i++) {
            idx = splitSol[i].charAt(0);
            if(idx == 32) {
                answer += idx;
            } else {
                for(int j = 0; j < n; j++) {
                    idx++;
                    if(idx == 123) {
                        idx = 97;
            }       else if(idx == 91) {
                        idx = 65;
            }
                    
                }
                answer += idx;
            }
        }
        return answer;
    }
}