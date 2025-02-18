import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        // 2016년 a월 b일을 LocalDate로 생성
        LocalDate date = LocalDate.of(2016, a, b);
        
        // 요일을 가져옴 (MONDAY, TUESDAY, ...)
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        
        // 요일을 한글자로 변환할 배열
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        
        // 요일의 숫자 값(1=월요일 ~ 7=일요일)에서 인덱스를 구함
        return days[dayOfWeek.getValue() % 7];
    }
}
