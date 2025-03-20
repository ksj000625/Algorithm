import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        // 각 작업의 완료 예상 날짜 계산 후 큐에 저장
        for (int i = 0; i < progresses.length; i++) {
            int remainingWork = 100 - progresses[i];
            int days = (int) Math.ceil((double) remainingWork / speeds[i]);
            queue.offer(days);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll(); // 첫 번째 작업의 완료일
            int count = 1;

            // 현재 작업과 함께 배포할 수 있는 기능 개수 확인
            while (!queue.isEmpty() && queue.peek() <= current) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        // List<Integer> → int[] 변환
        return result.stream().mapToInt(i -> i).toArray();
    }
}