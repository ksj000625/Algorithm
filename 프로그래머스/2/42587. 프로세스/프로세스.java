import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬

        // 큐 초기화 (우선순위, 인덱스 저장)
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
            priorityQueue.add(priorities[i]); // 우선순위 저장
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll(); // 현재 실행할 프로세스 (우선순위, 인덱스)

            // 가장 높은 우선순위인지 확인
            if (cur[0] == priorityQueue.peek()) {
                answer++; // 실행됨
                priorityQueue.poll(); // 우선순위 제거

                if (cur[1] == location) { // 찾고자 하는 프로세스 실행
                    return answer;
                }
            } else {
                // 우선순위가 낮다면 다시 큐에 삽입
                queue.add(cur);
            }
        }

        return answer;
    }
}
