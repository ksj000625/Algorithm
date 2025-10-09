import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxKey = -1;
        int maxValue = Integer.MIN_VALUE;
        int countMax = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
                countMax = 1;
            } else if (value == maxValue) {
                countMax++;
            }
        }

        return (countMax > 1) ? -1 : maxKey;
    }
}
