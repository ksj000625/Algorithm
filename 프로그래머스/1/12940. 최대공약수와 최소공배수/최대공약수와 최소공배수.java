class Solution {
    public int[] solution(int n, int m) {
        return new int[]{ gcd(n, m), lcm(n, m) };
    }
    
    public int gcd(int n, int m) {
        if(m == 0) return n;
        return gcd(m, n % m);
    }
    
    public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}