import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int count = 0;
		int sum = 0;
		
		for(int i = 1; i <= b; i++) {
		    for(int j = 1; j <= i; j++) {
		        count++;
		        
		        if(a <= count && count <= b) {
		            sum += i;
		        }
		    }
		}
		
		System.out.println(sum);
		
		scan.close();
	}
}