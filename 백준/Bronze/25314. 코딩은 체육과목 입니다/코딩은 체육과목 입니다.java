import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int inputByte = Integer.parseInt(br.readLine());
		int repeatCount = inputByte / 4;

		for(int i = 0; i < repeatCount ; i++) {
			System.out.print("long ");
		}

		System.out.print("int");

		br.close();
	}
}