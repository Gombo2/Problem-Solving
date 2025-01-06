class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
      String answer = "";
        int j = 0;
        int k = 0;
        for (int i = 0; i < goal.length; i++) {
           if(j < cards1.length && cards1[j].equals(goal[i])) {
               j++;
           } else if(k < cards2.length && cards2[k].equals(goal[i])) {
               k++;
           } else answer = "No";
        }
        if(answer != "No") {
            answer = "Yes";
        }
      return answer;
    }
}