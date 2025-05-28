import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String N = scan.next();
		int count = 0;
		int i = 1;
		
		while(true) {
			int front = 1;
			int back = 1;
			
			if(N.length() == 1) break;
			
			for(int j = 0; j < i; j++) {
				front *= N.charAt(j) - '0';
			}
			
			for(int j = i; j < N.length(); j++) {
				back *= N.charAt(j) - '0';
			}
			
			if(front == back) {
				count = 1;
				break;
			}
			
			if(i == (N.length() - 1)) break;
			
			i++;
			
		}
		String result = (count == 1) ? "YES" : "NO";
		
		System.out.println(result);
	}
}