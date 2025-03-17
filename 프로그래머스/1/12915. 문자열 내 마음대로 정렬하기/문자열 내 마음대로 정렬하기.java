import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            if (s1.charAt(n) == s2.charAt(n)) {
                return s1.compareTo(s2); // 사전순 정렬
            }
            return Character.compare(s1.charAt(n), s2.charAt(n)); // n번째 문자 기준 정렬
        });
        return strings;
    }
}