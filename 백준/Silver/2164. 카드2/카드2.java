import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int deckCount = Integer.parseInt(br.readLine());
        Deque<Integer> deck = new ArrayDeque<>();

        for(int i = 1; i <= deckCount; i++) {
            deck.add(i);
        }

        while(true) {
            if(deck.size() == 2) {
                deck.poll();
                System.out.println(deck.peek());
                break;
            } else if (deck.size() == 1) {
                System.out.println(deck.peek());
                break;
            } else {
                deck.poll();
                Integer a = deck.poll();
                deck.addLast(a);
            }
        }


    }
}
