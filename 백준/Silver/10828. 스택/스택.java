import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = null;
        Stack<Integer> stack = new Stack<>();
        int orderCount = Integer.parseInt(br.readLine());

        for(int i = 0; i < orderCount; i++) {
            String curOrder = br.readLine();
            int num = 0;
            if(curOrder.length() >= 6) {
               st = new StringTokenizer(curOrder);
               st.nextToken();
               num = Integer.parseInt(st.nextToken());
               stack.push(num);
            } else {
                if(curOrder.equals("top")) {
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.peek());
                    }
                } else if(curOrder.equals("size")) {
                    System.out.println(stack.size());
                } else if(curOrder.equals("empty")) {
                    if(stack.isEmpty()) {
                        System.out.println("1");
                    } else {
                        System.out.println("0");
                    }
                } else {
                    if(stack.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(stack.pop());
                    }
                }

            }
        }


    }
}
