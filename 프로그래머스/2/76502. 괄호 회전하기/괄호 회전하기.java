class Solution {
    public int solution(String s) {
        int answer = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i == 0) {
              if(isTrue(s)) {
                  answer++;
              }
            } else {
                s = rotateRight(s);
                if(isTrue(s)) {
                  answer++;
              }
            }
        }
        return answer;
    }
    
    private String rotateRight(String s) {
        return s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
    }
    
    private boolean isTrue(String s) {
        int prevLength;
        String small = "\\(\\)"; 
        String medium = "\\[\\]";
        String big = "\\{\\}";
        do {
            prevLength = s.length();
            s = s.replaceAll(small, "")
                .replaceAll(medium, "")
                .replaceAll(big, "");
        } while (s.length() < prevLength);

        return s.length() == 0 ? true : false;
    }
}