import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int firstBigNum = 0;
        int bigNumOneSum = 0;
        int i = n+1;
        int nOneSum = tenToTwoSum(n);
        
        while(true) {
            if(tenToTwoSum(i) == nOneSum) {
                answer = i;
                break;      
            } else {
                i++;
            }
        }
        
        return answer;
    }
    
    private int tenToTwoSum(int bigNum) {
        String two = "";
        int temp = 0;
        int count = 0;
        two = Integer.toBinaryString(bigNum);
        for(int i = 0; i < two.length(); i++) {
            if(two.charAt(i) == '1') {
                count++;
            }
        }
        return count; 
    }
}