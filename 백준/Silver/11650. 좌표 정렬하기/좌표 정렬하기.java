import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[][] pos = new int[n][2];
		
		for(int i = 0; i < n; i++) {
		    pos[i][0] = scan.nextInt();
		    pos[i][1] = scan.nextInt();
		}
		
		Arrays.sort(pos, (e1, e2) -> {
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			} else {
				return e1[0] - e2[0];
			}
		});
		
		for(int i = 0; i < n; i++) {
			System.out.println(pos[i][0] + " " + pos[i][1]);
		}
		
		scan.close();
	}
}