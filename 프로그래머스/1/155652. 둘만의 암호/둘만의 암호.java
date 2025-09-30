import java.util.HashSet;
import java.util.Set;

class Solution {
    public String solution(String s, String skip, int index) {
        Set<Character> skipSet = new HashSet<>();
        for (char c : skip.toCharArray()) {
            skipSet.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char cur = c;
            int moved = 0;
            while (moved < index) {
                cur++;
                if (cur > 'z') {
                    cur = 'a';
                }
                
                if (skipSet.contains(cur)) {
                    continue;
                }
                moved++;
            }
            sb.append(cur);
        }
        
        return sb.toString();
    }
}