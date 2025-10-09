class Solution {
    public int solution(String name) {
        int count = 0;
        int len = name.length();
        // 상/하 조작 비용 더하기
        for (int i = 0; i < len; i++) {
            char c = name.charAt(i);
            // 'A'에서 위로 올리는 것 또는 아래로 내려서 만드는 것 비교
            int up = c - 'A';
            int down = 'Z' - c + 1;
            count += Math.min(up, down);
        }

        // 좌/우 최소 이동 비용 계산
        int move = len - 1;  // 기본: 오른쪽으로 쭉 이동
        for (int i = 0; i < len; i++) {
            int next = i + 1;
            // 뒤에 연속된 'A' 구간을 건너뛸 인덱스 계산
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            // 오른쪽 → 왔다가 돌아오는 경로
            move = Math.min(move, i * 2 + (len - next));
            // 왼쪽 먼저 간 뒤 → 돌아와서 처리하는 경로
            move = Math.min(move, (len - next) * 2 + i);
        }

        return count + move;
    }
}
