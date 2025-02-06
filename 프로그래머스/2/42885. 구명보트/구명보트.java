import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);  // 사람들의 몸무게를 오름차순 정렬
        int left = 0;         // 가장 가벼운 사람의 인덱스
        int right = people.length - 1;  // 가장 무거운 사람의 인덱스
        int boats = 0;        // 사용한 보트 수

        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람의 합이 limit 이내면 같이 태움
            if (people[left] + people[right] <= limit) {
                left++;  // 가장 가벼운 사람 태움
            }
            // 가장 무거운 사람은 항상 태움
            right--;
            boats++;  // 보트 하나 사용
        }

        return boats;
    }
}
