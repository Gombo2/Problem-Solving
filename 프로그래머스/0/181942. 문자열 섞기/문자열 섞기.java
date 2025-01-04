class Solution {
    public String solution(String str1, String str2) {
        String arr1[] = str1.split("");
        String arr2[] = str2.split("");
        String sum = "";
    
        for (int i = 0; i < arr1.length ; i++ ) {
            sum += (arr1[i] + arr2[i]);
            }             
        sum = sum + "";
            return sum;
    }
}