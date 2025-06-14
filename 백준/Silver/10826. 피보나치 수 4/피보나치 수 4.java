import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        scan.close();
        
        BigInteger[] arr = new BigInteger[n+1];
        if(n == 0) {
            System.out.println(0);
            return;
        } else if(n == 1) {
            System.out.println(1);
            return;
        }
        arr[0] = BigInteger.ZERO;
        arr[1] = BigInteger.ONE;
        
        for(int i = 2; i <= n; i++) {
            arr[i] = arr[i-1].add(arr[i-2]);
        }
        
        System.out.println(arr[n]);
    }
}
