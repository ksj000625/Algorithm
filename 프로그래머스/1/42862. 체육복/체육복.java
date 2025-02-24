import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);

        boolean[] hasReserve = new boolean[n + 1];
        boolean[] isLost = new boolean[n + 1];

        for (int r : reserve) hasReserve[r] = true;
        for (int l : lost) isLost[l] = true;

        for (int i = 1; i <= n; i++) {
            if (hasReserve[i] && isLost[i]) {
                hasReserve[i] = false;
                isLost[i] = false;
            }
        }

        // 체육복 빌려주기
        for (int i = 1; i <= n; i++) {
            if (isLost[i]) {  // 체육복이 없는 학생
                if (i > 1 && hasReserve[i - 1]) {
                    // 앞 번호 학생이 여분을 가지고 있으면 빌려줌
                    hasReserve[i - 1] = false;
                    isLost[i] = false;
                } else if (i < n && hasReserve[i + 1]) {
                    // 뒷 번호 학생이 여분을 가지고 있으면 빌려줌
                    hasReserve[i + 1] = false;
                    isLost[i] = false;
                }
            }
        }

        // 체육 수업을 들을 수 있는 학생 수 계산
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (!isLost[i]) answer++;
        }

        return answer;
    }
}
