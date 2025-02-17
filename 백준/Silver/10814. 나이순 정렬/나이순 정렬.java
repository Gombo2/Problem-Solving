import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int arrSize = Integer.parseInt(st.nextToken());
        String[][] userInfo = new String[arrSize][2];

        for(int i = 0; i < arrSize; i++) {
            st = new StringTokenizer(br.readLine());
            userInfo[i][0] = "" + Integer.parseInt(st.nextToken());
            userInfo[i][1] = st.nextToken();
        }

        Arrays.sort(userInfo, new Comparator<String[]>() {
            @Override
            public int compare(String[] point1, String[] point2) {
                int xCompare = Integer.compare(Integer.parseInt(point1[0]), Integer.parseInt(point2[0]));

                return xCompare;
            }
        });

        for(int j = 0; j < arrSize; j++) {
            sb.append(userInfo[j][0] + " " + userInfo[j][1]).append("\n");
        }

        System.out.println(sb);
    }


}
