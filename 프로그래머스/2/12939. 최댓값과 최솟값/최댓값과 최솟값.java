class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] getArr = new int[sArr.length];
        int min = 0;
        int max = 0;
        for(int i = 0; i < getArr.length; i++) {
            getArr[i] = Integer.parseInt(sArr[i]);
        }
        min = getArr[0];
        max = getArr[0];
        
        for(int j = 1; j < getArr.length; j++) {
            min = Math.min(min, getArr[j]);
            max = Math.max(max, getArr[j]);
        }
        answer = min + " " + max;
        return answer;
    }
}