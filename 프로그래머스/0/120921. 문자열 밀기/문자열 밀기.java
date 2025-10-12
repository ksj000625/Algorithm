class Solution {
    public int solution(String A, String B) {
        // A와 B 길이 같다는 조건 문제에 있으니까 그건 가정
        int n = A.length();
        
        // 밀어본 횟수 0부터 n-1까지
        String temp = A;
        for (int i = 0; i < n; i++) {
            if (temp.equals(B)) {
                return i;
            }
            // 문자열을 한 칸 우측으로 미는 방법: 끝 문자 맨 앞으로
            temp = temp.charAt(n - 1) + temp.substring(0, n - 1);
        }
        
        return -1;
    }
}
