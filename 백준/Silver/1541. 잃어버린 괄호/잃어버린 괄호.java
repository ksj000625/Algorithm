import java.util.Scanner;

public class Main {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        String calLine = scan.next();
        
        String[] parts = calLine.split("-");
        
        int[] sums = new int[parts.length];
        
        for(int i = 0; i < parts.length; i++) {
            String[] numbers = parts[i].split("\\+");
            int tempSum = 0;
            for(String number: numbers) {
                tempSum += Integer.parseInt(number);
            }
            sums[i] = tempSum;
        }
        int answer = sums[0];
        
        for(int i = 1; i < sums.length; i++) {
            answer -= sums[i];
        }
        
        System.out.println(answer);
        
        scan.close();
    }
}