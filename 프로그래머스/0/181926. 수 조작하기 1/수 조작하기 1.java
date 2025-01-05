class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        String input[] = control.split("");
        
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals("w")) {
                n += 1;
            }
            else if(input[i].equals("s")) {
                n -= 1;
            }
            else if(input[i].equals("d")) {
                n += 10;
            }
            else if(input[i].equals("a")) {
                n -= 10;
            }
        }
        return n;
    }
}