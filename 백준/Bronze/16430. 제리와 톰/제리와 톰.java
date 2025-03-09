import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int top = Integer.parseInt(st.nextToken());
        int bottom = Integer.parseInt(st.nextToken());

        int getTop = bottom - top;

        sb.append(getTop)
                .append(" ")
                .append(bottom);

        System.out.println(sb);



    }
}
