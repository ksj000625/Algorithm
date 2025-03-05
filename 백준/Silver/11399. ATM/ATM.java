import java.util.Scanner;
import java.util.Arrays;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] p = new int[n];
        
        for(int i = 0; i < n; i++) {
            p[i] = scan.nextInt();
        }
        
        Arrays.sort(p);
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                sum += p[j];
            }
        }
        
        System.out.println(sum);
     }
}