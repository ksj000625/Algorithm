import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int count = 1;
		int number = 666;
		while(count != n) {
		    number++;
		    if(String.valueOf(number).contains("666")) {
		        count++;
		    }
		}
		
		System.out.println(number);
		
		scan.close();
	}
}