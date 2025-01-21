import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String each = Integer.toString(n);
        String[] eachNum = each.split("");
        for(int i = 0; i < eachNum.length; i++) {
            answer += Integer.parseInt(eachNum[i]);
        }
        

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }
}