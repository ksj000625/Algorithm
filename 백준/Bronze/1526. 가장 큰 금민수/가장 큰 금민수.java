import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		while(n >= 4) {
		    String nStr = Integer.toString(n);
		    int i = 0;
		    while (i < nStr.length()) {
		        if(nStr.charAt(i) != '4' && nStr.charAt(i) != '7') {
		            break;
		        }
		        
		        i++;
		    }
		    if(i == nStr.length()) {
		        System.out.println(nStr);
		        break;
		    }
		    n--;
		}
		
		scan.close();
	}
}