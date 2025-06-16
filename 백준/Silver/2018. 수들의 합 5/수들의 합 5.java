import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int answer = 0;
        
        int start = 1;
        int end = 1;
        int sum = 1;
        
        while(start <= end) {
            if(sum == n) answer++;
            if(sum < n) {
                end++;
                sum += end;
            } else if(sum >= n) {
                sum -= start;
                start++;
            }
        }
        
        System.out.println(answer);
        
        scan.close();
    }
}