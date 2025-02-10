import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputCount = Integer.parseInt(br.readLine());
        Stack<Character> checkVps = new Stack<>();
        for(int i = 0; i < inputCount; i++) {
            String eachVpsLine = br.readLine();
            System.out.println(isVps(checkVps, eachVpsLine));
            checkVps.clear();
        }

    }

    private static String isVps(Stack<Character> checkVps, String eachVpsLine) {
        checkVps.push(eachVpsLine.charAt(0));
        for(int i = 1; i < eachVpsLine.length(); i++) {
            if(!checkVps.isEmpty() && checkVps.peek() == '(' && eachVpsLine.charAt(i) == ')') {
                checkVps.pop();
            } else {
                checkVps.push(eachVpsLine.charAt(i));
            }
        }

        if(checkVps.isEmpty()) {
            return "YES";
        }
        return "NO";
    }
}
