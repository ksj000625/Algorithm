class Solution {
    public int solution(int[] common) {
        int n = common.length;
        // 등차 여부 판단
        int diff1 = common[1] - common[0];
        int diff2 = common[2] - common[1];

        if (diff1 == diff2) {
            // 등차수열
            return common[n - 1] + diff1;
        } else {
            // 등비수열
            int ratio = common[1] / common[0];
            return common[n - 1] * ratio;
        }
    }
}
