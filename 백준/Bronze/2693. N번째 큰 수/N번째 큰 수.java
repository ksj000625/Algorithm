import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int theNth = 3;  // 문제에서 제시한 3번째
        int testCase = sc.nextInt();  // 테스트 케이스 개수
 
        // 테스트 케이스 개수만큼 메서드 실행
        for (int i = 0; i < testCase; i++) {
            // N번째 (3번째) 큰 수 찾기
            int result = findTheNthLargestNunber(theNth);
            
            // 결과 출력
            System.out.println(result);
        }
    }
    
    public static int findTheNthLargestNunber(int theNth) {
        int[] arr = new int[10];  // 10개의 수를 입력 받을 array
        for (int j = 0; j < 10; j++) {
            arr[j] = sc.nextInt();  // 10개의 수 입력
        }
        
        Arrays.sort(arr);  // 숫자 입력된 array 오름차순 정렬
        int result = arr[10 - theNth];  // 오름차순 정렬된 array의 3번째 큰수는 index 7
        
        return result;
    }
    
}