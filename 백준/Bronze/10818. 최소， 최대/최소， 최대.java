import java.util.Scanner;
import java.util.*;
public class Main{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int[] num = new int[a];
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
        for (int j = 0; j < a; j++) {
            num[j] = sc.nextInt();
        }
        for (int i : num) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }    
     
       System.out.println(min + " " + max);
    }
}