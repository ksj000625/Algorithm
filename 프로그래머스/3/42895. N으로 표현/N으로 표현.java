import java.util.*;

class Solution {
    Set<Integer>[] set = new HashSet[9];
    public int solution(int N, int number) {
        int answer = 0;
        //N과 사칙연산만 사용해서 표현 할 수 있는 방법 중 N 사용횟수의 최솟값을 return 
        
        //사칙연산이 아닌 수 넣어주기 N, NN, NNN...
        int num = 0;
        for(int i=1; i<=8; i++){
            num = num*10 + N;
            set[i] = new HashSet<>();
            set[i].add(num);
        }
        
        if(N==number) return 1;
        
        for(int i=2; i<=8; i++){
            for(int j=1; j<i; j++){
                for(Integer a : set[j]){
                    for(Integer b: set[i-j]){
                        set[i].add(a+b);
                        set[i].add(a-b);
                        set[i].add(a*b);
                        if(b!=0) set[i].add(a/b);
                        if(a!=0) set[i].add(b/a);
                    }
                }
            }
            
            if(set[i].contains(number)){
                answer = i;
                return answer;
            }
        }
    
        answer = -1;
        
        return answer;
    }
}