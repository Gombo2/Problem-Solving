import java.util.*;

class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int column = 0;
        
        if(n % w == 0) {  //높이 선언.
            column = n / w;
        } else {
            column = (n / w) + 1;
        }
        
        int[][] allBox = new int[column][w];
        
        int reverseCount = 0;
        int boxNum = 1;
        boolean reverse = false;
        
        for(int i = 0; i < column; i++) {
            if(!reverse) {
                for(int j = 0; j < w; j++) {
                    if(boxNum > n) {
                        allBox[i][j] = 0;
                    } else{
                        allBox[i][j] = boxNum;    
                    }
                    boxNum++;
                    reverseCount++;
                }
            } else {
                for(int k = w - 1; k >= 0; k--) {
                    if(boxNum > n) {
                        allBox[i][k] = 0;
                    } else {
                        allBox[i][k] = boxNum;    
                    }
                    boxNum++;
                    reverseCount++;
                }
            }
            
            if(reverseCount == w) {
                if(reverse == true) {
                    reverse = false;
                } else {
                    reverse = true;
                }
                
                reverseCount -= w;
            }
        }
        
        
        int x = 0;
        int y = 0;
        int getY = 0;
        int getX = 0;
        
        while(true) {
            if(num == allBox[y][x]) {
                getY = y;
                getX = x;
                break;
            }
            x++;
            if(x == w) {
                x -= w;
                y += 1;
            }   
        }
        int emptyBox = 0;
        
        for(int i = 0; i < column; i++) {
            if(allBox[i][x] == 0) {
                emptyBox++;
            }
        }        

        answer = column - getY - emptyBox;
        
        
        return answer;
    }
}