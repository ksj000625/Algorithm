import java.util.Scanner;
import java.util.Arrays;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int answer = 0;
        
        String line = scan.nextLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int k = Integer.parseInt(line.split(" ")[1]);
        
        int[] cost = new int[n];
        
        for(int i = 0; i < n; i++) {
            cost[i] = scan.nextInt();
        }
        
        Arrays.sort(cost);
        
        for(int i = n - 1; k != 0 || i > 0; i--) {
            if(k < cost[i]) {
                continue;
            }
            
            while(k >= cost[i]) {
                k -= cost[i];
                answer++;
            }
        }
        
        System.out.println(answer);
     }
}