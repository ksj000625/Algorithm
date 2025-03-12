import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        int m = scan.nextInt();
        
        System.out.println(gcd(n, m));
        System.out.println((n * m) / gcd(n, m));

        scan.close();
	}
	
	// 최대공약수 구하기
	private static int gcd(int num1, int num2) {
	    if(num1 % num2 == 0) {
	        return num2;
	    } else {
	        return gcd(num2, num1 % num2);
	    }
	}
}