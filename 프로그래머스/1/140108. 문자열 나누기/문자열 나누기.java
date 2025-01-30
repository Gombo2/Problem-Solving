class Solution {
    public int solution(String s) {
        int answer = 0;
        char startEng;
        int same = 1;
        int diff = 0;
        startEng = s.charAt(0);
        if(s.length() == 1) {
            return 1;
        } else {
        for(int i = 1; i < s.length(); i++) {
            if(same == 0 && diff == 0) {
                startEng = s.charAt(i);
            }
            if(s.charAt(i) == startEng) {
                same++;
            } else {
                diff++;
            }
            if(same == diff) {
                answer++;
                same = 0;
                diff = 0; 
            }
        }
        if(same - diff != 0) {
            answer++;
        }
    }
        return answer;
    }
}