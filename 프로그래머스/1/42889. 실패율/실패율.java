import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCount = new int[N + 2]; // 각 스테이지에 머무는 사람 수
        for (int s : stages) {
            stageCount[s]++;
        }

        double[] failRate = new double[N + 1];
        int players = stages.length; // 전체 사람 수

        for (int i = 1; i <= N; i++) {
            if (players == 0) {
                failRate[i] = 0;
            } else {
                failRate[i] = (double) stageCount[i] / players;
                players -= stageCount[i];
            }
        }

        // 1~N 스테이지 번호 리스트
        Integer[] stageNums = new Integer[N];
        for (int i = 0; i < N; i++) stageNums[i] = i + 1;

        // 실패율 높은 순, 같으면 스테이지 번호 낮은 순
        Arrays.sort(stageNums, (a, b) -> {
            if (failRate[b] == failRate[a]) return a - b;
            return Double.compare(failRate[b], failRate[a]);
        });

        // Integer[] → int[] 변환
        int[] result = new int[N];
        for (int i = 0; i < N; i++) result[i] = stageNums[i];
        return result;
    }
}
