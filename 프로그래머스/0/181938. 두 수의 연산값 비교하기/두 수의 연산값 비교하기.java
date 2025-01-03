class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        if(Integer.parseInt(s1+s2) == 2*a*b) {
            return Integer.parseInt(s1+s2);
        }
        else {
        answer = (Integer.parseInt(s1+s2) > 2*a*b ? Integer.parseInt(s1+s2) : 2*a*b);
            return answer;
        }
    
    
    }
}