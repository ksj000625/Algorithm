class Solution {
    public int[] solution(long n) {
        String nString = String.valueOf(n);
        int length = nString.length();
        int[] answer = new int[length];
        
        for (int i = 0; i < length; i++) {
            answer[i] = nString.charAt(length - 1 - i) - '0';
        }
        
        return answer;
    }
}
