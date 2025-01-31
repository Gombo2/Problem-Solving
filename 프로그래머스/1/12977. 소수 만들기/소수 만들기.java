import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> sum = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                for(int k = j + 1; k < nums.length; k++) {
                    
                        sum.add(nums[i] + nums[j] + nums[k]);
                
            }
        }
    }
        
        int count = 0;
        
        for(int a = 0; a < sum.size(); a++) {
            count = 0;
            int idx = 2; 
            while(idx != sum.get(a)) {
               if(sum.get(a) % idx == 0) {
                   count = 1;
                   break;
               }
               idx++; 
            }
            
            if(count == 0) {
                answer++;
            }
            
        }
        
        return answer;
    }
}