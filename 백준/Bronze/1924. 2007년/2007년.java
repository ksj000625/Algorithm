import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		
		int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
		
		int n = 0;
		for(int i = 0; i < x; i++) {
		    n += months[i];
		}
		
		n += y - 1;
		
		System.out.println(days[n % 7]);
		
		
		
		scan.close();
	}
}