import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> key = new HashMap<>();
        for(int a = 0; a < players.length; a++) {
            key.put(players[a], a);
        }
        String temp = "";
        
        for(int i = 0; i < callings.length; i++) {
            temp = players[key.get(callings[i])]; // kai
            players[key.get(callings[i])] = players[key.get(callings[i]) - 1]; //3 -> poe
            players[key.get(callings[i]) - 1] = temp; //2 -> kai
            key.put(players[key.get(callings[i])], key.get(callings[i]));
            key.put(players[key.get(callings[i]) - 1], key.get(callings[i]) - 1);
        }
        return players;
    }
}