import java.util.Scanner;
import java.lang.StringBuilder;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = Integer.parseInt(scan.nextLine());
		String[] file = new String[n];
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
		    file[i] = scan.nextLine();
		}

        for (int i = 0; i < file[0].length(); i++) {
            boolean b = true;
            char c = file[0].charAt(i);
            for (int j = 1; j < n; j++) {
                if (c != file[j].charAt(i)) {
                    b = false;
                }
            }
            if (b) {
                sb.append(c);
            } else {
                sb.append("?");
            }
        }
        System.out.print(sb);
		
		scan.close();
	}
}