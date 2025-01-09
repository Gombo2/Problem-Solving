class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int temp = 0;
        int sum = 0;
        int x = 0; //총 교환받은 개수
        while (true) {
            if(n < a) {
                break;
            } else {
            temp = n % a;
            sum = (n / a)*b;
            n = sum + temp;
            x += sum;
            }
        }
        return x;
    }
}