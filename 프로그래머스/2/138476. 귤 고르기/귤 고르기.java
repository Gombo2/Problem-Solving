import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> eachSizeCount = new HashMap<>(); 
        
        for(int i : tangerine) {
            if(eachSizeCount.get(i) == null) {
                eachSizeCount.put(i,1);
            } else {
                eachSizeCount.put(i,eachSizeCount.get(i) + 1);
            }
        }
        
        int[] arr = new int[eachSizeCount.size()];
        
        arr = initializationArr(arr, eachSizeCount);
        Arrays.sort(arr);
        
        int count = 0;
        int index = arr.length -1;
        
        while(k > answer) {
            if(index == -1) {
                break;
            }
            answer += arr[index];
            index--;
            count++;
        }
        return count;
    }
    
    private int[] initializationArr(int[] arr, Map<Integer,Integer> eachSizeCount) {
        int idx = 0;
        
        for(int i : eachSizeCount.keySet()) {
            arr[idx] = eachSizeCount.get(i);
            idx++;
        }
        
        return arr;
    } 
}