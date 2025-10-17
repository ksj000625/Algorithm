class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int num : array) {
            // 각 숫자를 문자열로 바꾸고
            String s = Integer.toString(num);
            // 그 문자열의 각 문자 검사
            for (char c : s.toCharArray()) {
                if (c == '7') {
                    count++;
                }
            }
        }
        return count;
    }
}
