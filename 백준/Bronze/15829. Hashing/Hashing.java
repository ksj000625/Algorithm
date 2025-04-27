import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int r = 31;

        int len;
        String str;
        int alphaIndex;
        long sum = 0;

        len = scan.nextInt();
        str = scan.next();

        String[] strArray = str.split("");

        for(int i = 0; i < len; i++) {
            alphaIndex = (int)(strArray[i].charAt(0))-96;
            sum += alphaIndex * Math.pow(r, i);
        }

        System.out.println(sum);
        
        scan.close();
    }
}