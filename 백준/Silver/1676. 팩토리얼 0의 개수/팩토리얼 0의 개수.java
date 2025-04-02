import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.close();

        int answer = 0;
        for (int i = 5; i <= N; i *= 5) {
            answer += N / i;
        }

        System.out.println(answer);
    }
}
