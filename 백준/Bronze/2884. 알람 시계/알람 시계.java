import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, H;
        H = sc.nextInt();
        M = sc.nextInt();
        sc.close();
        if (M - 45 < 0) {
            H = H -1;
            if (H < 0) {
                H = 23;
            }
            M = (M+60) -45;    
        }
        else {
           M = M - 45;
        }
        System.out.println(H + " " + M);
    }
}