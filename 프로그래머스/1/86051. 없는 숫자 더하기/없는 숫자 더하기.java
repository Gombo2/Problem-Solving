import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int count = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < numbers.length; j++) {
                if (numbers[j] == i) {
                    count += i;
                }
            }
        }
        return (45 - count);
    }
}