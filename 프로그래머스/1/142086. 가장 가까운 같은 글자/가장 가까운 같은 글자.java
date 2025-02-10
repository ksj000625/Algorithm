import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()]; // 결과를 저장할 배열
        Map<Character, Integer> lastIndexMap = new HashMap<>(); // 문자의 마지막 인덱스를 저장

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            // 현재 문자가 이전에 등장한 적이 있는지 확인
            if (lastIndexMap.containsKey(currentChar)) {
                int lastIndex = lastIndexMap.get(currentChar);
                answer[i] = i - lastIndex; // 현재 인덱스와 마지막 등장 인덱스의 차이 저장
            } else {
                answer[i] = -1; // 처음 등장하는 문자라면 -1 저장
            }

            // 현재 문자의 마지막 등장 위치 갱신
            lastIndexMap.put(currentChar, i);
        }

        return answer;
    }
}
