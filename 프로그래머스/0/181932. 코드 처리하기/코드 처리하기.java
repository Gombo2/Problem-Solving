class Solution {
    public String solution(String code) {
        String answer = "";
        String codeArr[] = code.split("");
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            if (mode == false) {
                if(!codeArr[i].equals("1") && i % 2 == 0) {
                    answer = answer + codeArr[i]; 
                }
                else {
                    if(codeArr[i].equals("1")) {
                        mode = true;
                    }
                }
            } else {
            if (!codeArr[i].equals("1") && i % 2 == 1) {
                answer = answer + codeArr[i];
            } else {
                if (codeArr[i].equals("1")) {
                    mode = false;
                }
            }
                
            }
        }
        if(answer.equals("")) {
            answer = "EMPTY";
        }
        return answer;
    }
}