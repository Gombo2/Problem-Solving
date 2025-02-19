import java.util.*;
import java.io.*;

//점화식 f(n) = f(n-1) + f(n-2) + f(n-3);
public class Main {
    public static int[] memoization;
    public static int idx;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int numCount = Integer.parseInt(br.readLine());
        for(int i = 0; i < numCount; i++) {
            int targetNum = Integer.parseInt(br.readLine());
            memoization = new int[targetNum + 1];
            if(targetNum == 1) {
                sb.append("1").append("\n");
                continue;
            }
            if(targetNum == 2) {
                sb.append("2").append("\n");
                continue;
            }
            if(targetNum == 3) {
                sb.append("4").append("\n");
                continue;
            }
            memoization[1] = 1;
            memoization[2] = 2;
            memoization[3] = 4;
            sb.append(getNumberCasesSum(targetNum)).append("\n");
        }

        System.out.println(sb);
    }

    private static int getNumberCasesSum(int num) {
        if(num <= 3) {
            return memoization[num];
        }
        if(memoization[num] == 0) {
            memoization[num] = getNumberCasesSum(num - 1) + getNumberCasesSum(num - 2) + getNumberCasesSum(num - 3);
        }

        return memoization[num];
    }



}