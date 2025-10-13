class Solution {
    public int solution(int num, int k) {
        String numStr = String.valueOf(num);
        String kStr = String.valueOf(k);

        int idx = numStr.indexOf(kStr);
        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;  // indexOf는 0부터이니까 자리 수 맞추려면 +1
        }
    }
}
