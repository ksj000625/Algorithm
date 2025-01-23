import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        // 숫자를 문자열로 변환하여 리스트에 저장
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        // 두 문자열을 이어붙일 때 더 큰 값을 갖는 쪽을 앞에 배치하는 비교자 정의
        Arrays.sort(strNumbers, (a, b) -> (b + a).compareTo(a + b));
        
        // 0으로만 이루어진 배열인 경우 예외 처리
        if (strNumbers[0].equals("0")) return "0";
        
        // 정렬된 문자열들을 이어붙여 최종 문자열 생성
        for (String str : strNumbers) {
            answer += str;
        }
        
        return answer;
    }
}