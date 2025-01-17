import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        // key: 귤 크기, value: 개수
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        for(int i : tangerine){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // map의 키 값들만 list 형태로 가져옴
        List<Integer> list = new ArrayList<>(map.keySet());
        
        // map value 내림차순 정렬하기
        list.sort((o1, o2) -> map.get(o2) - map.get(o1));
        
        for(int i : list){
            k -= map.get(i);
            answer ++;
            
            if(k <= 0) break;
        }
        
        return answer;
    }
}