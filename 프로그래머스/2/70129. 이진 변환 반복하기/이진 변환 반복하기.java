class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zeroCount = 0;
        
        while(s.length() > 1) {
            int oneCount = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0') zeroCount++;
                else oneCount++;
            }
            
            s = Integer.toBinaryString(oneCount);
            count++;
        }
        
        int[] answer = { count, zeroCount };
        
        return answer;
    }
}