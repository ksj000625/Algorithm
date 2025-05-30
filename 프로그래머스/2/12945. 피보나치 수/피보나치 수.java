class Solution {
    public int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = (a + b) % 1234567;
            a = b;
            b = result;
        }

        return result;
    }
}
