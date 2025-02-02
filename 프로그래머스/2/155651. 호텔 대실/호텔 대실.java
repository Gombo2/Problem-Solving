import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        
        PriorityQueue<int[]> reservations = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        
       for(int i=0;i<book_time.length;i++){
            String[] time = book_time[i][0].split(":");
            int startMin = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
            time = book_time[i][1].split(":");
            int endMin = Integer.parseInt(time[0])*60+Integer.parseInt(time[1]);
            reservations.add(new int[]{startMin,endMin});
        }
        
        
        PriorityQueue<Integer> rooms = new PriorityQueue<>(); 
        rooms.add(0); 
        
        while(!reservations.isEmpty()){
            
            int[] nowReserve = reservations.poll();
            
           
            if(nowReserve[0]>=rooms.peek()){
                rooms.poll(); //룸 사용.
            }
            rooms.add(nowReserve[1]+10); 
        }
        
        return rooms.size();
    }
}