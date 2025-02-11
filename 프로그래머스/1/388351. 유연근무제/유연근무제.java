import java.util.*;
class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for(int i=0; i<schedules.length; i++){
            int count = check(schedules[i], timelogs[i], startday);
            if(count == 5){
                answer++;
            }
        }
        return answer;
    }
    
    public static int changeTime(int time){
        int hour = time / 100;
        int min = time % 100;
        
        int sum = hour*60 + min;
        return sum;
    }
    
    public static int check(int time, int[] timelog, int startday){
        int needTime = changeTime(time) + 10;
        int count = 0;
        int index = 0;
        while(true){
            int commuteTime = changeTime(timelog[index]);
            if(startday != 6 && startday != 0 && startday != 7){
                if (commuteTime <= needTime){
                    count++;
                }                
            }
            index++;
            startday = (startday + 1)% 7;
            if(index == timelog.length){
                break;
            }
        }
        return count;
    }
}