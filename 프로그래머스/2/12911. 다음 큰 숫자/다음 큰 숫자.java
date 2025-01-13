class Solution {
    public int solution(int n) {
        int answer = n;
        String num = Integer.toBinaryString(n);
        int answerCount = 0;
        for(int i = 0; i < num.length(); i++) {
            if(num.charAt(i) == '1') answerCount++;
        }
        
        answer++;
        
        while(true) {
            String candidate = Integer.toBinaryString(answer);
            int oneCount = 0;
            
            for(int i = 0; i < candidate.length(); i++) {
                if(candidate.charAt(i) == '1') oneCount++;
            }
            
            if(answerCount == oneCount) break;
            answer++;
        }
        
        return answer;
    }
}