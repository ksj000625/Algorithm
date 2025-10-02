import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sequence = new StringBuilder();
        int num = 0;

        while (sequence.length() < t * m) {
            String converted = Integer.toString(num, n).toUpperCase();
            sequence.append(converted);
            num++;
        }

        for (int i = p - 1; i < sequence.length() && answer.length() < t; i += m) {
            answer.append(sequence.charAt(i));
        }

        return answer.toString();
    }
}
