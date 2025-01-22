import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) { 
        int[] notIn = new int[1];
        notIn[0] = -1;
        
        int count = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i : arr) {
            if (i % divisor == 0) {
             list.add(i);
             count++;
            }
        }
        
        list.sort(Comparator.naturalOrder());
        
        int[] result = new int[list.size()];
        for(int j = 0; j < list.size(); j++) {
            result[j] = list.get(j);
        }
        
        if(count == 0) {
            return notIn;
        } else {
        return result;
        }

    }
}