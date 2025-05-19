import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int i = 2;
		while(n != 1) {
		    if(n % i == 0) {
		        n /= i;
		        System.out.println(i);
		    } else {
		        i++;
		    }
		}
		
		scan.close();
	}
	
}