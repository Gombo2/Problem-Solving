class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int count = 0;
        int[] wall = setWallToOne(n);
        wall = fillWall(wall, section);
        for(int i = 0; i < wall.length; i++) {
            count = 0;
            if(wall[i] != 0) {
                continue;
            } else {
                i += m - 1;
                answer++;
            }
        }
        
        return answer;
    }
    
    private int[] setWallToOne(int n) {
        int[] wall = new int[n];
        for(int i = 0; i < wall.length; i++) {
            wall[i] = 1;
        }   
        return wall;
    }
    
    private int[] fillWall(int[] oneWall, int[] section) {
        for(int j : section) {
            oneWall[j - 1] = 0;
        }
        return oneWall;
    }
}