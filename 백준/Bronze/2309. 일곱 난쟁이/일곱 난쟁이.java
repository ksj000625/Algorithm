import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] h = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
		    h[i] = scan.nextInt();
		    sum += h[i];
		}
		
		for (int i = 0; i < 8; i++) {
            for (int j = i+1; j < 9; j++) {
                if (sum - h[i] - h[j] == 100) {
                    h[i] = 0;
                    h[j] = 0;
                    Arrays.sort(h);
                    for (int k = 2; k < 9; k++) {
                        System.out.println(h[k]);
                    }
                    return;
                }
            }
        }
		
		scan.close();
	}
}