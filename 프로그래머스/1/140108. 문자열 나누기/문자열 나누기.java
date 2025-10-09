class Solution {
    public int solution(String s) {
        int answer = 0;
        int xCount = 0;
        int otherCount = 0;
        char[] arr = s.toCharArray();
        char first = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == first) xCount++;
            else otherCount++;

            if (xCount == otherCount) {
                answer++;
                if (i + 1 < arr.length) {
                    first = arr[i + 1];
                }
                xCount = 0;
                otherCount = 0;
            }
        }

        if (xCount != 0 || otherCount != 0) {
            answer++;
        }

        return answer;
    }
}
