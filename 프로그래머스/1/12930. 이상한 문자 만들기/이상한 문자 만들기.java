class Solution {
    public String solution(String s) {
        String answer = "";
        int count = 0;
        String[] solSplit = s.split("");
        for(int i = 0; i < solSplit.length; i++) {
              if(solSplit[i].equals(" ")) {
                 count = 0;
              }  else {
                if(count % 2 == 0) {
                    solSplit[i] = solSplit[i].toUpperCase();
                    count++;
                } else {
                    solSplit[i] = solSplit[i].toLowerCase();
                    count++;
                }
              }
            answer += solSplit[i];
            }
        return answer;
    }
}