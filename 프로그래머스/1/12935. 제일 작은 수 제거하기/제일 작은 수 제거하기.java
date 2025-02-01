import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIndex] > arr[i]) minIndex = i;
        }

        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(minIndex);

        return list.stream().mapToInt(i -> i).toArray();
    }
}
