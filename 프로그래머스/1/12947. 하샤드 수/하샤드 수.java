class Solution {
    public boolean solution(int x) {
        int originalX = x;
        int sum = 0;
        while(x > 0) {
            sum += x % 10;
            x /= 10;
        }
        
        if(originalX % sum == 0) return true;
        else return false;
    }
}