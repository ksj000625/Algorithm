import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{priorities[i], i});
            priorityQueue.add(priorities[i]);
        }

        int answer = 0;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();

            if (cur[0] == priorityQueue.peek()) {
                answer++;
                priorityQueue.poll();

                if (cur[1] == location) {
                    return answer;
                }
            } else {
                queue.add(cur);
            }
        }

        return answer;
    }
}
