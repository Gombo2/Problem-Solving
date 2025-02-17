import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        Set<Integer> numSet = new HashSet<>();
        int num = 0;
        int allOrderNum = Integer.parseInt(br.readLine());
        for(int i = 0; i < allOrderNum ; i++) {
            st = new StringTokenizer(br.readLine());

            String order = st.nextToken();
            if(st.hasMoreTokens()) {
                num = Integer.parseInt(st.nextToken());
            }
            switch (order) {
                case "add":
                    numSet.add(num);
                    break;
                case "check":
                    if(numSet.contains(num)) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "remove":
                    if(numSet.contains(num)) {
                        numSet.remove(num);
                    }
                    break;
                case "toggle":
                    if(numSet.contains(num)) {
                        numSet.remove(num);
                    } else {
                        numSet.add(num);
                    }
                    break;
                case "all":
                    numSet = initializationSet(numSet);
                    break;

                case "empty":
                    numSet.clear();
                    break;
            }

        }


        System.out.println(sb);
    }


    private static Set<Integer> initializationSet(Set<Integer> numSet) {
        numSet.clear();
        for(int i = 1; i <= 20; i++) {
            numSet.add(i);
        }

        return numSet;
    }
}
