class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < absolutes.length; i++) {
            if(signs[i] == true) {
                sum = sum + absolutes[i];
            } else {
                sum = sum + absolutes[i]*(-1);
            }
        }
        return sum;
    }
}