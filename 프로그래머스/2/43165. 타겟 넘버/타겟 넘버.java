import java.util.*;

class Solution {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        
        // dfs 함수 호출 
        dfs(numbers, 0, 0, target);
        
        return answer;
    }
    
    // 나올 수 있는 모든 값들을 구하기 위한 재귀 함수   
    public void dfs(int[] numbers, int index, int ret, int target) {
        // 모든 배열 값들에 대한 연산을 마쳤을 경우
        if(numbers.length == index){
            // 타겟 넘버가 1 미만일 경우에 대한 예외처리
            if(ret < 1) 
                return;                        
            // target값과 동일할 경우 count 증가
            if(ret == target)
                answer++;
            
            return ;
        }

        // 덧셈 & 뺄셈 에 대한 재귀호출
        dfs(numbers, index + 1, ret + numbers[index], target);
        dfs(numbers, index + 1, ret - numbers[index], target);
    }
}