class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int painted = 0; // 마지막으로 칠해진 위치

        for (int s : section) {
            if (s > painted) { // 현재 구역이 아직 칠해지지 않았다면
                answer++; // 롤러 사용
                painted = s + m - 1; // 롤러가 칠할 수 있는 마지막 위치
            }
        }

        return answer;
    }
}
