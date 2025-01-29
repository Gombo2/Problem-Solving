import java.util.*;
import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int[] resultArr = Arrays.stream(nums)
                          .distinct()
                          .toArray();
        if(resultArr.length <= nums.length / 2) {
            answer = resultArr.length;
        } else if (resultArr.length > nums.length / 2) {
           answer = nums.length / 2;
        }
        
        return answer;
    }
}