class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        String sum1 = as + bs;
        String sum2 = bs + as;
    
        
        if (Integer.parseInt(sum1) >= Integer.parseInt(sum2)) {
            return Integer.parseInt(sum1);
        }
        else {
            return Integer.parseInt(sum2);
        }        
        
    }
}