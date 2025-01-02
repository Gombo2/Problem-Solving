import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        //변수 A,B,C 값의 범위가 int형을 넘어감으로 long형으로 선언
        sc.close();
        
        System.out.println(A+B+C);
       
    }
}