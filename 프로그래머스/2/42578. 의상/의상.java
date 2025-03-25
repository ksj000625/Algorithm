import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        // 각 의상 종류별 개수를 저장
        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 조합 계산 (각 종류별 (개수 + 1)을 곱한 후 1 빼기)
        int answer = 1;
        for (int count : map.values()) {
            answer *= (count + 1);
        }

        return answer - 1; // 아무것도 입지 않는 경우 제외
    }
}
