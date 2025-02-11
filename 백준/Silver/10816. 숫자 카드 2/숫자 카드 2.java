import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> curDeck = new HashMap<>();
        int curDeckSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < curDeckSize; i++) {
            int curCard = Integer.parseInt(st.nextToken());
            if(curDeck.get(curCard) == null) {
                curDeck.put(curCard, 1);
            } else {
                curDeck.put(curCard, curDeck.get(curCard) + 1);
            }
        }

        int findDeckSize = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int j = 0; j < findDeckSize; j++) {
            int findCard = Integer.parseInt(st.nextToken());
            if(curDeck.get(findCard) == null) {
                sb.append("0 ");
            } else {
                sb.append(curDeck.get(findCard) + " ");
            }
        }

        System.out.println(sb);

    }
}
