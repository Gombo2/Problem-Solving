import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) { /* 범위지정 n번 반복 */
            System.out.print(str); /* 반복문을 이용한 출력 개행문자 포함x */
        }
    }
}