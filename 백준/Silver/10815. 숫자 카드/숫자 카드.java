import java.util.Scanner;
import java.util.Arrays;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] cards = new int[n];
        for(int i = 0; i < n; i++) {
            cards[i] = scan.nextInt();
        }
        Arrays.sort(cards);
        
        int m = scan.nextInt();
        int[] arr = new int[m];
        for(int i = 0; i < m; i++) {
            int num = scan.nextInt();
            if(Arrays.binarySearch(cards, num) >= 0) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        
        scan.close();
     }
}