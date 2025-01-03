class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int count = 0; 
        String[] storage = new String[100];
        for (int i = 0 ;  i < todo_list.length ; i++ ) {
            if(finished[i] == false) {
                storage[count] = todo_list[i];
                count++;
            } 
        }
        String[] answer = new String[count];
        for(int j = 0; j < count; j++) {  
            answer[j] = storage[j];
        }
        return answer;    
        }    
    }
