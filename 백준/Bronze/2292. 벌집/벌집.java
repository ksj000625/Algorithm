import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
 
        int n = scan.nextInt();
        
        int count = 1;
        int range = 2;
        
        if(n == 1) {
            System.out.println(1);
        } else {
            while(range <= n) {
                range += (6 * count);
                count ++;
            }
            
            System.out.println(count);
        }
        

        scan.close();
	}
}