import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
 
		int n = scan.nextInt();
		
	    for(int i = 0; i < n; i++) {
	        for(int j = 0; j < n; j++) {
	           if(j < n - (i+1)) {
	                System.out.print(" ");
	           }
	           else {
	                System.out.print("*");
	           }
	        }
	        System.out.println();
	    }
		
		scan.close();
	}
}