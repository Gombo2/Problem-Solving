import java.util.*;
import java.io.*;

public class Main {
    static int sum;
    static int maxSum = -1000000001;
    static int minSum = 1000000001;

    static int[] numArr;
    static int[] operatorCaseArr;  //size = 4 , + - * / 순서대로 개수 입력
    static int numCase;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        numCase = Integer.parseInt(br.readLine());
        numArr = new int[numCase];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numCase; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        operatorCaseArr = new int[4];
        for (int j = 0; j < 4; j++) {
            operatorCaseArr[j] = Integer.parseInt(st.nextToken());
        }

        bt(numArr[0], 1);

        sb.append(maxSum).append("\n").append(minSum);
        System.out.println(sb);

    }

    private static void bt(int sum, int idx) {
        if (idx == numCase) {
            maxSum = Math.max(maxSum, sum);
            minSum = Math.min(minSum, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {

            if (operatorCaseArr[i] > 0) {

                operatorCaseArr[i]--;

                switch (i) {

                    case 0:
                        bt(sum + numArr[idx], idx + 1);
                        break;
                    case 1:
                        bt(sum - numArr[idx], idx + 1);
                        break;
                    case 2:
                        bt(sum * numArr[idx], idx + 1);
                        break;
                    case 3:
                        bt(sum / numArr[idx], idx + 1);
                        break;
                }
                    //람다식으로 변환 가능할지도?
                    operatorCaseArr[i]++;
                }
            }
        }

    }