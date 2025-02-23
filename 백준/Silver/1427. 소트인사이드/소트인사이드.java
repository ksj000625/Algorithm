import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        scan.close();

        char[] digits = number.toCharArray();
        
        Arrays.sort(digits);

        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
