class Solution {
    public long solution(int a, int b) {
        if(a > b) return getBetweenSum(b, a);
        else return getBetweenSum(a, b);
    }
    
    public long getBetweenSum(int min, int max) {
        long sum = 0;
        
        for(int i = min; i <= max; i++) sum += i;
        
        return sum;
    }
}