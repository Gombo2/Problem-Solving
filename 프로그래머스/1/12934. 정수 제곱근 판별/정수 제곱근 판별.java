class Solution {
    public long solution(long n) {
        double answer = 0;
        if(Math.sqrt(n) - (int)Math.sqrt(n) != 0) {
            return -1;
        } else {
            answer = (Math.sqrt(n)+1) * (Math.sqrt(n)+1);
        }
        return (long)answer;
    }
}