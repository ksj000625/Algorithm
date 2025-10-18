import java.util.*;

class Solution {
    public int solution(String[][] book_time) {
        int n = book_time.length;

        // 1) 분 단위로 변환 + 청소시간 추가
        int[][] times = new int[n][2];
        for (int i = 0; i < n; i++) {
            times[i][0] = convertToMinutes(book_time[i][0]);         // 입실 시간
            times[i][1] = convertToMinutes(book_time[i][1]) + 10;    // 퇴실 시간 + 청소시간
        }

        // 2) 입실 시간 기준으로 정렬
        Arrays.sort(times, (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        // 3) 우선순위 큐로 “다음 사용 가능 시간” 관리
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int[] t : times) {
            int start = t[0];
            int end   = t[1];

            // 제일 빨리 비는 객실이 현재 입실 시간 이전 혹은 같다면 재사용 가능
            if (!pq.isEmpty() && pq.peek() <= start) {
                pq.poll();
            }
            // 새 예약을 위해 이 객실(재사용하거나 새 방) 종료시간 추가
            pq.offer(end);
        }

        // 큐의 크기가 필요한 객실 수
        return pq.size();
    }

    // HH:MM 문자열 → 분 단위 정수 변환
    private int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hh = Integer.parseInt(parts[0]);
        int mm = Integer.parseInt(parts[1]);
        return hh * 60 + mm;
    }
}
