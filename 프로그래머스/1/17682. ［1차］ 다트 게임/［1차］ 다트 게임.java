import java.util.*;

class Solution {
    public int solution(String dartResult) {
        List<Integer> scores = new ArrayList<>();
        char[] arr = dartResult.toCharArray();
        int score = 0;
        
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            
            // 숫자 처리
            if (Character.isDigit(c)) {
                // 10 처리
                if (c == '1' && i + 1 < arr.length && arr[i + 1] == '0') {
                    score = 10;
                    i++; // '0' 스킵
                } else {
                    score = c - '0';
                }
            } 
            // 보너스 처리 (S, D, T)
            else if (c == 'S' || c == 'D' || c == 'T') {
                switch (c) {
                    case 'S': score = (int)Math.pow(score, 1); break;
                    case 'D': score = (int)Math.pow(score, 2); break;
                    case 'T': score = (int)Math.pow(score, 3); break;
                }
                scores.add(score);
            }
            // 옵션 처리 (*, #)
            else if (c == '*' || c == '#') {
                int lastIndex = scores.size() - 1;
                
                if (c == '*') {
                    // 현재 점수 2배
                    scores.set(lastIndex, scores.get(lastIndex) * 2);
                    // 이전 점수도 존재하면 2배
                    if (lastIndex > 0) {
                        scores.set(lastIndex - 1, scores.get(lastIndex - 1) * 2);
                    }
                } else if (c == '#') {
                    scores.set(lastIndex, scores.get(lastIndex) * -1);
                }
            }
        }

        // 최종 합산
        return scores.stream().mapToInt(Integer::intValue).sum();
    }
}
