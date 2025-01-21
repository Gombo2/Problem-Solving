import java.util.stream.*;

class Solution {
    public boolean solution(String s) {
        // 문자열을 소문자로 변환
        String lowerCaseString = s.toLowerCase();

        // 'p'와 'y'의 개수를 스트림으로 계산
        long pCount = lowerCaseString.chars()
                                     .filter(ch -> ch == 'p')
                                     .count();

        long yCount = lowerCaseString.chars()
                                     .filter(ch -> ch == 'y')
                                     .count();

        // 'p'의 개수와 'y'의 개수를 비교하여 결과 반환
        return pCount == yCount;
    }
}