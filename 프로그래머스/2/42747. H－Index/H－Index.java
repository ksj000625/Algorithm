import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);  // 오름차순 정렬
        int n = citations.length;

        for (int i = 0; i < n; i++) {
            int h = n - i; // 현재 논문의 개수
            if (citations[i] >= h) {
                return h; // H-Index 조건 충족 시 반환
            }
        }

        return 0; // H-Index가 없는 경우
    }
}
