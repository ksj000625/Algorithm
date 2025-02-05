class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int left = 0;
        while((n + left) / a > 0) {
            answer += ((n + left) / a) * b;
            n = ((n + left) / a) * b + (n % a); 
        }
        
        return answer;
    }
}