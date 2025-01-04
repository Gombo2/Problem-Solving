class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        if (aLong >= bLong) {
            return aLong;
        }
            return bLong;
    }
}