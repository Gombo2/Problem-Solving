class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int curHealth = health;
        int time = 1;
        int count = 0;
        for(int i = 0; i < attacks.length; i++) {
          while (time <= attacks[i][0]) {
             if(time == attacks[i][0]) {
                 curHealth -= attacks[i][1];
                 if(curHealth <= 0) {
                     answer = curHealth;
                     break;
                 }
                 count = 0;  
             } else {
                 count++;
                 if(count == bandage[0]) {
                 curHealth += bandage[1] + bandage[2];
                 count = 0;
                 } else {
                     curHealth += bandage[1];
                 }
                 if (curHealth >= health) {
                     curHealth = health;
                 }
             }
              time++;//else 끝나는 부분
          } if(curHealth <= 0) {
               curHealth = -1; 
              break;
              
            }// while문 끝나는 부분.
        }//for문 끝나는 부분
        answer = curHealth;
        return answer;
    }
} 