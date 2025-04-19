import java.util.Scanner;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int h = scan.nextInt();
        int m = scan.nextInt();
        
        scan.close();
        
        if(m >= 45) {
            System.out.println(h + " " + (m - 45));
        } else {
            int other = 45 - m;
            int hour;
            if(h == 0) {
                hour = 23;
            } else {
                hour = h - 1;
            }
            System.out.println(hour + " " + (60 - other));
        }
        
     }
}