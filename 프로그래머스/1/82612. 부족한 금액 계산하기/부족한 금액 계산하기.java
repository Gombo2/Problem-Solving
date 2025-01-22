import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long cSum = 1;
        long priceSum = 0;
        long dif = 0;
        while(cSum <= count) {
            priceSum += price*cSum;
            cSum++;
        }
        if(money - priceSum >= 0) {
            answer = 0;
        } else {
        dif = Math.abs(money - priceSum);
        answer = dif;
        }
        return answer;
    }
}