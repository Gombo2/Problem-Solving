import java.util.*;
import java.lang.*;

class Solution {
    public long solution(int w, int h) {
        long answer = 1;
        long deleted = 0;
        double[] xArr = new double[h];
        for(int i = 0; i < h; i++) {
            xArr[i] = (double)(i+1) * (double)w / (double)h;  //높이 1부터 h까지의 x좌표 모임.
        }
        
        double start = Math.ceil(xArr[0]);
        deleted += start;
        // System.out.println(deleted);
        for(int i = 1 ; i < h; i++) {
          deleted += Math.ceil(xArr[i]) - Math.floor(xArr[i-1]);
          // System.out.println(deleted);
        }
        
        return (long)w * h - deleted;
    }
} 