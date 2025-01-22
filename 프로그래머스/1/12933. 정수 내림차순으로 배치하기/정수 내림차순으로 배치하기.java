import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long temp = 0;
        String sAnswer = "";
        String nToStr = Long.toString(n);
        String[] nSplit = nToStr.split("");
        Arrays.sort(nSplit);
        for(int i = (nSplit.length)-1; i >= 0; i--) {
            sAnswer += "" + nSplit[i];
        }
        return Long.parseLong(sAnswer);
    }
}