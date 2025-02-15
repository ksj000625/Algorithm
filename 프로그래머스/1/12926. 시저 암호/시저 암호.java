class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(char c: s.toCharArray()) {
            if(c == ' ') {
                answer += c;
                continue;
            }
            for(int i = 1; i <= n; i++) {
                if(c == 'z') c = 'a';
                else if(c == 'Z') c = 'A';
                else c++;
            }
            answer += c;
        }
        
        return answer;
    }
}