import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[6];
		
		for(int i = 0; i < 6; i++) {
			a[i] = scan.nextInt();
		}
		int t = scan.nextInt();
		int p = scan.nextInt();
		
		int count = 0;
		for(int i = 0; i < 6; i++) {
			count += a[i] / t;
			if(a[i] % t != 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(n / p + " " + n % p);
		scan.close();
	}
}