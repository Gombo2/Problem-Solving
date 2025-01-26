import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int width=0;
        int length=0;
        for(int i=0;i<sizes.length;i++){
            int w=Math.max(sizes[i][0],sizes[i][1]);
            int l=Math.min(sizes[i][0],sizes[i][1]);
            width=Math.max(width,w);
            length=Math.max(length,l);
        }
        return answer=width*length;
    }
}
