class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int divisors = 0;

        // 1부터 number까지의 숫자에 대해 약수 개수를 구하고, limit과 비교하여 결과값 계산
        for (int i = 1; i <= number; i++) {
            divisors = divisorsCount(i);
            if (divisors > limit) {
            	// 약수 개수가 limit보다 큰 경우, power 값을 더함
                answer += power;
            } else {
            	// 약수 개수가 limit 이하인 경우, 약수 개수를 더함
                answer += divisors;
            }
        }

        return answer;
    }

    // 약수의 개수 구하기
    private int divisorsCount(int num) {
        int count = 0;
        
        // 1부터 num의 제곱근까지 반복하여 약수의 개수를 구함
        for (int i = 1; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                count++;
                // i가 num의 제곱근이 아닌 경우에 대한 약수
                if (num / i != i) {
                    count++;
                }
            }
        }

        return count;
    }
}