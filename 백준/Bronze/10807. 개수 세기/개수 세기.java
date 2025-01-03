import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int count = 0;						
        int N = sc.nextInt();
        int[] Narr = new int[N];				

        for(int i = 0; i < N; i++) {
            Narr[i] = sc.nextInt();			 
        }
        int v = sc.nextInt();			
        for(int j = 0; j < Narr.length; j++){ 
            if(v == Narr[j]){				 
                count++;
            }
        }
        System.out.println(count);
    }
}