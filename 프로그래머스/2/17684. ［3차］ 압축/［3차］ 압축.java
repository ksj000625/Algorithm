import java.util.*;

class Solution {
    public int[] solution(String msg) {
        // 1. 사전 초기화 (A ~ Z)
        Map<String, Integer> dict = new HashMap<>();
        int dictIndex = 1;
        for (char c = 'A'; c <= 'Z'; c++) {
            dict.put(String.valueOf(c), dictIndex++);
        }
        // dictIndex 는 이제 27부터 새 단어 색인으로 사용할 것

        List<Integer> output = new ArrayList<>();

        int start = 0;
        int len = msg.length();
        while (start < len) {
            int end = start + 1;
            // 가능한 가장 긴 w 찾기
            while (end <= len && dict.containsKey(msg.substring(start, end))) {
                end++;
            }
            // `end` 가 사전에 없는 부분 바로 다음이므로, w = substring(start, end-1)
            String w = msg.substring(start, end - 1);
            output.add(dict.get(w));

            // w 뒤에 c 가 남아 있다면 사전에 등록
            if (end <= len) {
                String wc = msg.substring(start, end);
                dict.put(wc, dictIndex++);
            }

            // 다음 탐색은 w 길이만큼 건너뜀
            start += w.length();
        }

        // 결과 리스트 → 배열 변환
        return output.stream().mapToInt(i -> i).toArray();
    }
}
