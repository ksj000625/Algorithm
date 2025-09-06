import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String isbn = scan.nextLine().trim();
        scan.close();

        int starIdx = isbn.indexOf('*');
        int sum = 0;

        for (int i = 0; i < 13; i++) {
            if (i == starIdx) continue;
            int digit = isbn.charAt(i) - '0';
            sum += digit * (i % 2 == 0 ? 1 : 3);
        }

        int weight = (starIdx % 2 == 0) ? 1 : 3;

        for (int d = 0; d <= 9; d++) {
            if ((sum + d * weight) % 10 == 0) {
                System.out.println(d);
                return;
            }
        }
    }
}
