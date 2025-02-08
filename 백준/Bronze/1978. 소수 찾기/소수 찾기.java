import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int ans = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		outer: for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) continue outer;
			else {
				for (int j = 2; j <= Math.sqrt(num); j++) {
					if(num % j == 0) continue outer;
				}
			}
			
			ans++;
		}
		
		System.out.println(ans);

	}

}
