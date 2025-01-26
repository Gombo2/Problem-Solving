class Solution {
    public int solution(int n) {
        int answer = 0;
        int sqrt = 0;
        String reverse = "";
        while(n != 0) {
        reverse += (n%3);
        n /= 3;
        }
        System.out.println(reverse);
        String[] reverseNum = reverse.split("");
        for(int i = reverse.length() - 1; i >= 0; i--) {
            answer += Integer.parseInt(reverseNum[i])*(Math.pow(3,sqrt));
            sqrt++;
        }
        
        return answer;
    }
}