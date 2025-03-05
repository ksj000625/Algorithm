import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        int[] arr = new int[n + 1];
        int[] prefixSum = new int[n + 1];
        
        for (int k = 1; k <= n; k++) {
            arr[k] = scan.nextInt();
            prefixSum[k] = prefixSum[k - 1] + arr[k];
        }
        
        for (int k = 0; k < m; k++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            System.out.println(prefixSum[j] - prefixSum[i - 1]);
        }
        
        scan.close();
    }
}
