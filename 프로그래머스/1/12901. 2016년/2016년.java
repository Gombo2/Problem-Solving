class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int daySum = 0;
        int[] monthPerDay = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < a; i++) {
            if(i == a - 1) {
                monthPerDay[i] = b; 
            }
            daySum += monthPerDay[i];
        }
        daySum = daySum % 7;
         System.out.println(daySum);
        switch (daySum) {
            case 1 :
                answer = "FRI";
                break;
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 :
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
            case 0 :
                answer = "THU";
                break;
            
        }
        return answer;
    }
}