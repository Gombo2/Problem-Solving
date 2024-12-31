import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	int l;
	Scanner input = new Scanner(System.in);
	l = input.nextInt();
	for(int i = 1; i <= l; i++) {
		for (int j = 1; j < i; j++) {
			System.out.print(" ");
		}
		for (int k = l; k>= i; k--) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
}
