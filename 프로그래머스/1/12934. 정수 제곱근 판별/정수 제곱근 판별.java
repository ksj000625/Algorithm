class Solution {
    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        
        if (sqrt == (long) sqrt) {
            long nextNumber = (long) sqrt + 1;
            return nextNumber * nextNumber;
        } else {
            return -1;
        }
    }
}
