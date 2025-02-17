import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int arrSize = Integer.parseInt(br.readLine());
        int[] timeArr = new int[arrSize];
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        int idx = 0;

        while (st.hasMoreTokens()) {
            timeArr[idx] = Integer.parseInt(st.nextToken());
            idx++;
        }

        Arrays.sort(timeArr);

        idx = 0;
        for (int i = timeArr.length - 1; i >= 0; i--) {
            answer += timeArr[idx] * (i + 1);
            idx++;
        }

        sb.append(answer);
        System.out.println(sb);

    }
}
