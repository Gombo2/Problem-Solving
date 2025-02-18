import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static boolean[] find = new boolean[9];
    static int[] dwarfs = new int[9];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 9; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(dwarfs);

        findDwarfs(0, 0, 0);

        for (int i = 0; i < 9; i++) {
            if (find[i]) sb.append(dwarfs[i]).append("\n");
        }

        System.out.println(sb);
    }

    public static boolean findDwarfs(int idx, int count, int sum) {
        if (sum > 100) {
            return false;
        }
        if (count == 7 && sum == 100) {
            return true;
        }

        for(int i=idx;i<9;i++){
            find[i] = true;
            if(findDwarfs(i+1,count+1,sum+dwarfs[i])) {
                return true;
            }
            find[i] = false;
        }
        return false;
    }
}