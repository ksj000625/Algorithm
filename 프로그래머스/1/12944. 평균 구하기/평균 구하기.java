class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i : arr) {
            answer += Double.parseDouble(String.valueOf(i));
        }
        
        return answer / arr.length;
    }
}