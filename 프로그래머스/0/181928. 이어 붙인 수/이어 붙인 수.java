class Solution {
    public int solution(int[] num_list) {
        int answer;
        String odd = "";
        String even = "";
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 1) {
            odd += "" + num_list[i];
            } 
            else {
                even += "" + num_list[i];
            }
    }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
        
    }
}