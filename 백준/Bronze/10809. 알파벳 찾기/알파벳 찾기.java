import java.util.Scanner;

public class Main {
     public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        
        int[] alphabet = new int[26];
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = -1;
        }
        
        String s = scan.nextLine();
        
        for(int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - 'a';
            
            if(alphabet[num] != -1) {
                continue;
            } else {
                alphabet[num] = i;
            }
        }
        
        for(int a: alphabet) {
            System.out.print(a + " ");
        }
        
        scan.close();
     }
}