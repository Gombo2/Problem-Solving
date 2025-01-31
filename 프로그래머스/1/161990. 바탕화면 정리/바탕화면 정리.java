class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {-1,-1,-1,-1};
        
        for(int i = 0; i < wallpaper.length; i++) {
          if(wallpaper[i].contains("#")) {
              answer[2] = i+1;
              if(answer[0] == -1) { //시작점 y좌표 지정.
                  answer[0] = i;
                  answer[2] = answer[0] + 1;
                  System.out.println("시작점 y좌표 지정 : " + answer[0] +" " + answer[2]);
              }
              if(answer[1] == -1) { //시작점 x좌표 지정
                  answer[1] =  wallpaper[i].indexOf("#");;
                  answer[3] =  answer[1] + 1;
                  System.out.println("시작점 x좌표 지정 : " + answer[1] +" " + answer[3]);
              }
              if(wallpaper[i].indexOf("#") < answer[1]) {
                  answer[1] = wallpaper[i].indexOf("#");
                  System.out.println("x최소좌표 변경 : " + answer[1]);
              }
              if(wallpaper[i].lastIndexOf("#") >= answer[3]) {
                  answer[3] = wallpaper[i].lastIndexOf("#") + 1;
                  System.out.println("x최대좌표 변경 : " + answer[3]);
              }
          }  
        }
        
        return answer;
    }
}