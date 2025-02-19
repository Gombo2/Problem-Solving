import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int size = Integer.parseInt(br.readLine());
        sb.append(solution(size));

        System.out.println(sb);
    }

    public static int solution(int input) {
        int[] dp = new int[input + 1];

        if(input <= 1) {
            return input;
        }
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= input; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 10007;
        }
        return dp[input];
    }
}

