class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        // (num-1)*num/2 만큼이 연속 숫자 증가분의 합
        int offsetSum = (num - 1) * num / 2;
        // 시작값 a 구하기
        int a = (total - offsetSum) / num;

        for (int i = 0; i < num; i++) {
            answer[i] = a + i;
        }

        return answer;
    }
}
