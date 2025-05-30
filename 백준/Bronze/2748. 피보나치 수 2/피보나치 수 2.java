import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] arr = new long[n + 1];
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i <= n; i++) {
		    arr[i] = arr[i - 1] + arr[i - 2];
		}
		
		System.out.println(arr[n]);
		
		scan.close();
	}
}