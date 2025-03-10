import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        double[] score = new double[n];
        
        for(int i = 0; i < n; i++) {
            score[i] = scan.nextDouble();
        }
        
        Arrays.sort(score);
        double sum = 0;
        
        for(int i = 0; i < n; i++) {
            score[i] = score[i] / score[n - 1] * 100;
            sum += score[i];
        }
        
        System.out.println(sum / score.length);
        
        scan.close();
    }
}
