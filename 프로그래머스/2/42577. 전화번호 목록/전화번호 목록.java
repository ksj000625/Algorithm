import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> phoneSet = new HashSet<>();

        // 1. 모든 전화번호를 HashSet에 저장
        for (String phone : phone_book) {
            phoneSet.add(phone);
        }

        // 2. 각 번호에 대해 접두사가 HashSet에 있는지 확인
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                if (phoneSet.contains(phone.substring(0, i))) {
                    return false; // 접두사가 존재하면 false 반환
                }
            }
        }

        return true; // 접두어가 없으면 true 반환
    }
}
