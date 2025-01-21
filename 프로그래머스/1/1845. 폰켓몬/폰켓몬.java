import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        // HashSet을 사용하여 중복을 제거하고 폰켓몬 종류를 저장
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        // 선택할 수 있는 폰켓몬의 최대 개수는 N/2
        int maxSelect = nums.length / 2;
        
        // 종류의 수와 N/2 중 더 작은 값을 반환
        return Math.min(set.size(), maxSelect);
    }
}
