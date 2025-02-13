import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            int num;
            int idx;
            int result = 0;
            int count = 0;
            st = new StringTokenizer(br.readLine());
            num = Integer.parseInt(st.nextToken());
            idx = Integer.parseInt(st.nextToken());
            for(int i = 1; i <= num; i++) {
                if( num % i == 0) {
                    count++;
                }

                if (count == idx) {
                    result = i;
                    break;
                }
            }

            System.out.println(result);
        }
    }