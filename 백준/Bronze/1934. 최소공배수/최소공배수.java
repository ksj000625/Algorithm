import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i = 0; i < t; i++) {
		    String line = scan.nextLine();
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    
		    System.out.println(a * b / gcd(a, b));
		}
		
		scan.close();
	}
	
	private static int gcd(int a, int b) {
	    if(b == 0) return a;
	    else return gcd(b, a % b);
	}
	
}