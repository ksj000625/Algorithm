import java.util.HashSet;
import java.util.Set;

class Solution {
    private Set<Integer> numberSet = new HashSet<>();

    public int solution(String numbers) {
        char[] numArr = numbers.toCharArray();
        boolean[] visited = new boolean[numArr.length];

        // 모든 조합 생성
        generatePermutations(numArr, visited, "");

        // 소수 개수 카운트
        int count = 0;
        for (int num : numberSet) {
            if (isPrime(num)) {
                count++;
            }
        }

        return count;
    }

    private void generatePermutations(char[] numArr, boolean[] visited, String current) {
        if (!current.isEmpty()) {
            numberSet.add(Integer.parseInt(current));
        }

        for (int i = 0; i < numArr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                generatePermutations(numArr, visited, current + numArr[i]);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
