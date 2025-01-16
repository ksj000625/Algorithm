import java.util.*;

class Solution {
    // 유클리드 호제법(최대 공약수 구하기)
    public static int gcd(int a, int b){
        int maxNum = Math.max(a, b);
        int minNum = Math.min(a, b);
        
        while(minNum!=0){
            int r = maxNum % minNum;
            maxNum = minNum;
            minNum = r;
        }
        
        return maxNum;
    }
    
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for(int i = 1;i<arr.length;i++){
            // 최대공약수 (arr[0], arr[i]) 구하기(두 수의 최소공배수를 구하기 위해서)
            int gcd = gcd(answer,arr[i]);
            // 최소공배수 구하기 (최소공배수 = 첫번째 수 * 두번째 수 / 최대공약수)
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
}