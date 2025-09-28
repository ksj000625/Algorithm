import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        // 각 문자의 최소 누른 횟수를 기록할 맵 생성
        Map<Character, Integer> keyPressCount = new HashMap<>();
        
        // keymap을 순회하여 각 문자의 최소 누른 횟수 기록
        for (String keys : keymap) {
            for (int i = 0; i < keys.length(); i++) {
                char c = keys.charAt(i);
                keyPressCount.put(c, Math.min(keyPressCount.getOrDefault(c, Integer.MAX_VALUE), i + 1));
            }
        }
        
        // targets를 순회하여 각 문자열의 키 누른 횟수 합산
        for (int i = 0; i < targets.length; i++) {
            int totalPress = 0;
            for (char c : targets[i].toCharArray()) {
                Integer press = keyPressCount.get(c);
                if (press == null) {
                    totalPress = -1;
                    break;
                }
                totalPress += press;
            }
            answer[i] = totalPress;
        }
        
        return answer;
    }
}
