class Solution {
    public int solution(int n) {
        String reversedBase3 = new StringBuilder(Integer.toString(n, 3)).reverse().toString();

        return Integer.parseInt(reversedBase3, 3);
    }
}