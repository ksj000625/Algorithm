class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numberStrings = s.split(" ");
        int[] numbers = new int[numberStrings.length];
        
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i : numbers) {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        answer = String.valueOf(min) + " " + String.valueOf(max);
        
        return answer;
    }
}