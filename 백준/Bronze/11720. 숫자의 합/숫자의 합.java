import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
 
		int n = scan.nextInt();
		String a = scan.next();
		
		int sum = 0;
        
		for(int i = 0; i < n; i++) {
			sum += a.charAt(i)-'0';
		}
		System.out.print(sum);
		
		scan.close();
	}
}