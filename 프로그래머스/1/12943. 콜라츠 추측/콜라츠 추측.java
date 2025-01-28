class Solution {
    public int solution(int num) {
        int count = 0;
        long number = num; // int 범위를 초과할 수 있으므로 long 타입으로 변환

        while (number != 1) {
            if (count >= 500) {
                return -1; // 500번 반복해도 1이 되지 않으면 -1 반환
            }

            if (number % 2 == 0) {
                number /= 2; // 짝수일 경우 2로 나눔
            } else {
                number = number * 3 + 1; // 홀수일 경우 3을 곱하고 1을 더함
            }
            count++; // 횟수 증가
        }

        return count; // 1이 되었을 때의 횟수 반환
    }
}
