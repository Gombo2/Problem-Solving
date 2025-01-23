class Solution {
    public int solution(String t, String p) {
        int result = 0;
        String temp = "";
        int lenDif = numLength(t) - numLength(p) + 1;
        if (t.length() == p.length()) {
          result = Long.parseLong(t) <= Long.parseLong(p) ? 1 : 0;
        } else {
        for(int i = 0; i < lenDif; i++) {
               temp = t.substring(i,i+p.length());
                if(Long.parseLong(temp) <= Long.parseLong(p)) {
                    result++;
                }
         }
        }
        return result;
    }
    private int numLength(String n) {
        int numLen = n.length();
        return numLen;
    }

}