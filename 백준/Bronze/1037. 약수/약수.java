import java.util.Scanner;
import java.util.Arrays;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int k = scan.nextInt();
        int[] arr = new int[k];
        
        for(int i = 0; i < k; i++) {
            arr[i] = scan.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println(arr[0] * arr[k - 1]);
        
        scan.close();
     }
}