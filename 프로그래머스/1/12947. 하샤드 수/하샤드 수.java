class Solution {
    public boolean solution(int x) {
        int xSum = 0;
        String xStr = Integer.toString(x);
        String[] xSplit = xStr.split("");
        for (int i = 0; i < xSplit.length; i++) {
            xSum += Integer.parseInt(xSplit[i]);
        }
        return x % xSum == 0 ? true : false;
    }
}