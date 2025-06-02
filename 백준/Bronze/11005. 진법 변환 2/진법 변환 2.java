import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int b = scan.nextInt();
		ArrayList<Character> list = new ArrayList<>();
		
		while(n > 0) {
		    list.add(n % b < 10 ? (char)(n % b + '0') : (char)(n % b - 10 + 'A'));
            n /= b;
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i));
        }
		
		scan.close();
	}
}