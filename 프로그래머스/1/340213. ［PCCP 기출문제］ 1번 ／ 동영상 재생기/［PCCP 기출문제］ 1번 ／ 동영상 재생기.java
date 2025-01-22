class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        String min = "";
        String sec = "";
        
        min = video_len.substring(0,2);
        sec = video_len.substring(3,5);
        int secVideo_len = (Integer.parseInt(min))*60 + (Integer.parseInt(sec));
        
        min = op_start.substring(0,2);
        sec = op_start.substring(3,5);
        int secOp_start = (Integer.parseInt(min))*60 + (Integer.parseInt(sec));
        
        min = op_end.substring(0,2);
        sec = op_end.substring(3,5);
        int secOp_end = (Integer.parseInt(min))*60 + (Integer.parseInt(sec));
        
        min = pos.substring(0,2);
        sec = pos.substring(3,5);
        int secPos = (Integer.parseInt(min))*60 + (Integer.parseInt(sec));
        
        for(int i = 0; i < commands.length; i++) {
            if(secOp_start <= secPos && secPos <= secOp_end) {
                 secPos = secOp_end;  
                } 
            if (commands[i].equals("next")) {
                if(secVideo_len - secPos <= 10) {
                    secPos = secVideo_len;
                } else {
                  secPos += 10;   
                }
            } else { //next if문 끝난부분.
                if(secPos <= 10) {
                    secPos = 0;
                } else {
                    secPos -= 10;
                }
            } 
              if(secOp_start <= secPos && secPos <= secOp_end) {
                 secPos = secOp_end;  
                } 
        } //for문 종료 지점. 
        int resultMin = secPos / 60;
        int resultSec = secPos % 60;
        if(resultMin < 10) {
            answer += "0" + resultMin + ":";
        } else {
            answer += resultMin + ":";
        }
        if(resultSec < 10) {
            answer += "0" + resultSec;
        } else {
            answer += "" + resultSec;
        }
        return answer;
    }
}