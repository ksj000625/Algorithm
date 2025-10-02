import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int time = 0;

        // 캐시 사이즈가 0이면 모든 요청이 miss
        if (cacheSize == 0) {
            return cities.length * 5;
        }

        Deque<String> cache = new ArrayDeque<>();

        for (String city : cities) {
            String key = city.toLowerCase();

            if (cache.contains(key)) {
                // cache hit
                time += 1;
                // 기존 위치에서 제거하고 최신으로 갱신
                cache.remove(key);
                cache.addLast(key);
            } else {
                // cache miss
                time += 5;
                if (cache.size() >= cacheSize) {
                    // 캐시가 꽉 찼으면 LRU 항목 제거
                    cache.pollFirst();
                }
                cache.addLast(key);
            }
        }

        return time;
    }
}
