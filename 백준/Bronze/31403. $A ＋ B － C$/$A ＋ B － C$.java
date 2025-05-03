import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
 
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c));
		System.out.println(Integer.parseInt(a + b) - Integer.parseInt(c));
		
		scan.close();
	}
}