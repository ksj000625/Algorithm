class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        // 1. 진법 변환: n을 k진수 문자열로 변환
        String kNum = Integer.toString(n, k);
        
        // 2. 0을 기준으로 나눔
        String[] parts = kNum.split("0");
        
        for (String part : parts) {
            if (part.isEmpty()) {
                continue;
            }
            
            long num;
            try {
                num = Long.parseLong(part);
            } catch (NumberFormatException e) {
                continue; // 변환 불가능한 경우 무시
            }
            
            // 3. 소수인지 검사
            if (isPrime(num)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        // even 수 걸러내기
        if (num % 2 == 0) {
            return false;
        }
        long limit = (long) Math.sqrt(num);
        for (long i = 3; i <= limit; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
