class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] arr1ToTwo = new String[n];
        String[] arr2ToTwo = new String[n];
        
        for(int i =  0; i < n; i++) {
            arr1ToTwo[i] = returnEachRow(n, arr1[i]);
            arr2ToTwo[i] = returnEachRow(n, arr2[i]);
            answer[i] = getAnswer(arr1ToTwo[i],arr2ToTwo[i]);
        }
        return answer;
    }
    
    private String returnEachRow(int n,int curArr) {
        String curMap = "";
        while(curArr != 0) {
            curMap += "" + (curArr % 2);
            curArr = curArr / 2;
        }
        while(curMap.length() != n) {
            curMap += "" + "0";
        }
        return curMap;
    }
    
    private String getAnswer(String two1, String two2) {
        String answer = "";
        for(int i = two1.length() -1; i >= 0; i--) {
            if(two1.charAt(i) == '0' && two2.charAt(i) == '0') {
                answer += " ";
            } else {
                answer += "#";
            }
        }
        return answer;
    }
}