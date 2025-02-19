import java.util.*;
import java.io.*;

public class Main {
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());

        int numArrSize = Integer.parseInt(st.nextToken());
        int addCase = Integer.parseInt(st.nextToken());

        int[] numArr = new int[numArrSize + 1];

        st = new StringTokenizer(br.readLine());

        for(int i = 1; i <= numArrSize; i++) {
            numArr[i] = numArr[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < addCase; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            sb.append(numArr[end] - numArr[start - 1]).append("\n");
        }

        System.out.println(sb);
    }
}