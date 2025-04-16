import java.util.Scanner;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine().trim();
        
        if (sentence.equals("")) {
            System.out.println(0);
        } else {
            String[] arr = sentence.split(" ");
            System.out.println(arr.length);
        }
        
        scan.close();
     }
}