import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int counts = Integer.parseInt(br.readLine());
		int A;
		int B;
		int index = 1;

		for(int i = 0; i < counts; i++) {

			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			bw.write("Case #" + index + ": " + (A+B) + "\n");
			index++;

		}

		bw.flush();
		br.close();
		bw.close();

	}
}