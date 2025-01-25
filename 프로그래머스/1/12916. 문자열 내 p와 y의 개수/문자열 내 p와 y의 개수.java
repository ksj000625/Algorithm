

class Solution {
    boolean solution(String s) {
        int numP = 0;
        int numY = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p') numP++;
            else if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') numY++;
        }
        
        return numP == numY;
    }
}