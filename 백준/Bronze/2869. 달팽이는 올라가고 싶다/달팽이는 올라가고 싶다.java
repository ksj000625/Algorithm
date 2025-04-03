import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int v = scan.nextInt();
        
		scan.close();
		
		int day = (int) Math.ceil((double)(v - a) / (a - b)) + 1;
		
		System.out.println(day);
	}
}