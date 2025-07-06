import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int sum = 0;
		int stuffPrice;
		int stuffCount;

		int amount = Integer.parseInt(br.readLine());
		int count = Integer.parseInt(br.readLine());

		for(int i = 0; i < count; i++) {

			st = new StringTokenizer(br.readLine());

			stuffPrice = Integer.parseInt(st.nextToken());
			stuffCount = Integer.parseInt(st.nextToken());
			sum += (stuffPrice * stuffCount);
		}

		String result = checkValidation(amount, sum);
		System.out.println(result);

	}

	public static String checkValidation(int sum, int resultSum) {

		return sum == resultSum ? "Yes" : "No";
	}

}