import java.util.Scanner;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int k = scan.nextInt();
        
        int numA = 0;
        int numB = 1;
        
        for(int i = 1; i < k; i++) {
            int temp = numB;
            numB += numA;
            numA = temp;
        }
        
        System.out.println(numA + " " + numB);
        
        scan.close();
     }
}